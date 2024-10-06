package com.demojwt.demojwt.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Cargar usuario desde base de datos o una fuente externa
        // Ejemplo: retorna un usuario con contraseña codificada con BCrypt
        return new org.springframework.security.core.userdetails.User(
                "user",
                new BCryptPasswordEncoder().encode("password"),
                new ArrayList<>());
    }
}
