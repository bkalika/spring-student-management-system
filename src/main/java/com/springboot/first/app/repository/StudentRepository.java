package com.springboot.first.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
