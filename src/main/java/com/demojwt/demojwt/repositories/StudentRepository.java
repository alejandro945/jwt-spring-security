package com.demojwt.demojwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demojwt.demojwt.models.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}