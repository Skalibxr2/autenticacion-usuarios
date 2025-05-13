# Microservicio de Autenticación y Gestión de Usuarios

Este microservicio permite gestionar el registro, consulta, modificación y eliminación de usuarios.

## Endpoints disponibles

- `GET /api/v1/usuarios`: Listar todos los usuarios
- `GET /api/v1/usuarios/{id}`: Obtener un usuario por ID
- `POST /api/v1/usuarios`: Crear un nuevo usuario
- `PUT /api/v1/usuarios/{id}`: Actualizar un usuario
- `DELETE /api/v1/usuarios/{id}`: Eliminar un usuario

## Requisitos

- Java 21
- Maven
- MySQL (base de datos `usuarios_db`)
