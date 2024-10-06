package com.demojwt.demojwt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.demojwt.demojwt.beans.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class StudentController {

    public static List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{firstName}/{lastName}")
    public Student getStudent(@PathVariable String firstName, @PathVariable String lastName) {
        for (Student student : students) {
            if (student.getName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @GetMapping("/students/query")
    public Student studentQueryParam(@RequestParam String firstName, @RequestParam String lastName) {
        return new Student(firstName, lastName);
    }
    
    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }
    

    @PutMapping("student/{firstName}")
    public void updateStudent(@PathVariable String firstName, @RequestBody Student student) {
        for (Student s : students) {
            if (s.getName().equals(firstName)) {
                s.setName(student.getName());
                s.setLastName(student.getLastName());
            }
        }   
    }
    
    @DeleteMapping("student/{firstName}")
    public void deleteStudent(@PathVariable String firstName) {
        students.removeIf(s -> s.getName().equals(firstName));
    }
}
