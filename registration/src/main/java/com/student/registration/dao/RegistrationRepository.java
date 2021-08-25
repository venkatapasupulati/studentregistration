package com.student.registration.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.registration.entities.StudentRegistration;

public interface RegistrationRepository extends JpaRepository<StudentRegistration, String> {

	public void deleteByStudentId(String studentId);
	
	public void findAllByCourseName(String courseName,Pageable page);
	
	public List<StudentRegistration> findByCourseNameOrderByStudentNameAsc(String courseName);
}
