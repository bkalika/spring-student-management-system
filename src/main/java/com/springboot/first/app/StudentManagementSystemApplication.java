package com.springboot.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.first.app.entity.Student;
import com.springboot.first.app.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String[] args) {
//		Student student1 = new Student("Bohdan", "Kalika", "bogdan.kalika@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Bohdan2", "Kalika2", "bogdan.kalika@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Bohdan4", "Kalika2", "bogdan.kalika@gmail.com");
//		studentRepository.save(student3);
	}

}
