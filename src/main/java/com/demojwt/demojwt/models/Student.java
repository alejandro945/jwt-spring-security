package com.demojwt.demojwt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    private String name;

    private String lastName;

}