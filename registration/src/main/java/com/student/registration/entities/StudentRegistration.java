package com.student.registration.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATION")
public class StudentRegistration {

	@Id
	private String registrationId;
	
	private String studentId;
	
	private String studentName;
	
	private String courseId;
	
	private String courseName;
	
	private Date createdDate;

	public StudentRegistration( String studentId, String studentName, String courseId,
			String courseName, Date createdDate) {
		super();
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
		this.courseName = courseName;
		this.createdDate = createdDate;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	
	
	
	
}
