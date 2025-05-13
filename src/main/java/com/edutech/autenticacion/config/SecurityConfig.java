package com.edutech.autenticacion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Este bean nos permite inyectar un codificador de contraseñas
     * que utiliza el algoritmo BCrypt (seguro y recomendado).
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Define las reglas de seguridad para los endpoints
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF para facilitar pruebas con Postman
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/usuarios/**").permitAll() // ✅ Endpoints públicos
                        .anyRequest().authenticated() // 🔒 Todo lo demás requiere autenticación
                )
                .httpBasic(Customizer.withDefaults()); // Usa autenticación básica si lo deseas

        return http.build();
    }
}
