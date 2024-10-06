package com.demojwt.demojwt.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.demojwt.demojwt.models.Student;
import com.demojwt.demojwt.services.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StudentController {

    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/students/{firstName}")
    public Optional<Student> getStudent(@PathVariable String firstName) {
        return studentService.findById(firstName);
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @PutMapping("student/{firstName}")
    public void updateStudent(@PathVariable String firstName, @RequestBody Student student) {
        studentService.update(firstName, student);
    }

    @DeleteMapping("student/{firstName}")
    public void deleteStudent(@PathVariable String firstName) {
        studentService.delete(firstName);
    }
}
