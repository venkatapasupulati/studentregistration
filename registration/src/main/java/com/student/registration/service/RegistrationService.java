package com.student.registration.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.registration.dao.RegistrationRepository;
import com.student.registration.dao.StudentRepository;
import com.student.registration.entities.Course;
import com.student.registration.entities.Student;
import com.student.registration.entities.StudentRegistration;
import com.student.registration.vo.StudentVO;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository repository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@PersistenceContext
	private EntityManager entityManger;
	
	
	//add a new student along with their course registrations.
	@Transactional
	public void register(StudentVO studentvo) {
		
		if(studentvo !=null) {
			studentRepository.save(new Student(studentvo.getId(), 
					studentvo.getName()));
			
			for (Course course : studentvo.getCourses()) {
				repository.save(
						new StudentRegistration(studentvo.getId(), 
								studentvo.getName(),
								course.getId(), course.getName(),new Date()));
			}
		
		}
	}
	
	//Delete a student
	@Transactional
	public void delete(Student student) {
		// Delete all registration for that student
		repository.deleteByStudentId(student.getId());
		// Delete student from student table.
		studentRepository.delete(student);
	}
	
	// Get all students, sorted by their name, for a given course with course name as input
	public List<StudentRegistration> getAllStudentsByCourseName(String courseName) {
		
		List<StudentRegistration> students = repository.findByCourseNameOrderByStudentNameAsc(courseName);
		return students;
	}
	
	//find all students who don’t register for a given course?  
	public List<Student> findNonRegisteredStudents(){
		
		return entityManger.createQuery("select A.id from student A \n" + 
				"LEFT JOIN registration B on A.id=B.studentId \n" + 
				"where B.studentId IS NULL",Student.class).getResultList();
	}
	
}
