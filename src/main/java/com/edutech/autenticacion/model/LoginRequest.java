package com.edutech.autenticacion.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String correo;
    private String contrasena;
}
