package com.demojwt.demojwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demojwt.demojwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
