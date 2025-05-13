package com.edutech.autenticacion.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String correo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private String rol; // Ej: ADMIN, USUARIO
}