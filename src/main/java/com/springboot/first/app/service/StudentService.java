package com.springboot.first.app.service;

import java.util.List;

import com.springboot.first.app.entity.Student;

public interface StudentService {
	List<Student> getStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Student student);

}
