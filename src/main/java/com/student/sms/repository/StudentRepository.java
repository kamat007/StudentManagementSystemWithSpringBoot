package com.student.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}


// SimpleJpaRepository is an implementation class of JpaRepository
// which already contains @Repository, therefore no need to annotate with @Repository