package com.student.registration.vo;

import java.util.List;

import com.student.registration.entities.Course;


public class StudentVO {

	private String id;
	
	private String name;
	
	private List<Course> courses;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
