package com.demojwt.demojwt.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demojwt.demojwt.models.Student;
import com.demojwt.demojwt.repositories.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student save(Student studentDto) {
        return studentRepository.save(studentDto);
    }

    public List<Student> findAll() {
        return studentRepository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Student update(String firstName, Student studentDto) {
        Student student = studentRepository.findById(firstName).get();
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        return studentRepository.save(student);
    }

    public Optional<Student> findById(String firstName) {
        return studentRepository.findById(firstName);
    }

    public void delete(String firstName) {
        studentRepository.deleteById(firstName);
    }

}
