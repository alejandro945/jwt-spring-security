package com.demojwt.demojwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.demojwt.demojwt.models.User;
import com.demojwt.demojwt.repositories.UserRepository;

@Component
public class DefaultUserInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userSerivce;

    @Autowired
    private PasswordEncoder passwordEncoder; // Para codificar la contraseña

    @Override
    public void run(String... args) throws Exception {
        // Verifica si el usuario ya existe
        // Crea un nuevo usuario
        User defaultUser = new User();
        defaultUser.setUsername("admin");
        defaultUser.setPassword(passwordEncoder.encode("admin")); // Encripta la contraseña
        userSerivce.save(defaultUser);
        System.out.println("Usuario 'admin' creado por defecto");
    }
}
