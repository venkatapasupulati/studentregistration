package com.student.registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.registration.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
