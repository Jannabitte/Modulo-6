# VetTaskAPI - Evaluación Final Módulo 6

## Descripción del proyecto

VetTaskAPI es una API REST desarrollada con Spring Boot y Gradle para gestionar proyectos y tareas.  
El proyecto fue realizado como evaluación final del Módulo 6, aplicando Spring Web, Spring Data JPA, Spring Security, H2 Database y autenticación mediante JWT.

El enfoque principal de la actividad es la construcción de una API REST segura. Como contexto leve, se utilizó una veterinaria, donde los proyectos pueden representar campañas internas, control administrativo, seguimiento clínico o planificación de tareas relacionadas con la gestión veterinaria.

## Objetivo

Crear una API REST segura que permita administrar proyectos y tareas asociadas, protegiendo los endpoints mediante autenticación JWT.

## Tecnologías utilizadas

- Java 21
- Spring Boot 4.x.x
- Gradle
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- H2 Database
- Lombok
- Validation

## Funcionalidades principales

- Crear, listar, actualizar y eliminar proyectos.
- Crear, listar, actualizar y eliminar tareas.
- Asociar tareas a proyectos.
- Listar tareas por proyecto.
- Autenticación mediante usuario y contraseña.
- Generación de token JWT.
- Protección de endpoints mediante JWT.
- Uso de base de datos H2 en memoria para pruebas.

## Estructura del proyecto

```text
cl.vettask.api
├── controller
│   ├── AuthController
│   ├── ProyectoController
│   └── TareaController
├── dto
│   ├── AuthRequest
│   └── AuthResponse
├── model
│   ├── Proyecto
│   └── Tarea
├── repository
│   ├── ProyectoRepository
│   └── TareaRepository
├── security
│   ├── JwtAuthFilter
│   ├── JwtService
│   └── SecurityConfig
├── service
│   ├── ProyectoService
│   └── TareaService
└── VetTaskApiApplication