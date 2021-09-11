package com.springboot.first.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.first.app.entity.Student;
import com.springboot.first.app.repository.StudentRepository;
import com.springboot.first.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.deleteById(student.getId());
	}
	

}
