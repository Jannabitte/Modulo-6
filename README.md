# VetSecurityCare - Spring Security

## Descripción del proyecto

Este proyecto corresponde a una actividad individual del Módulo 6, enfocada en la implementación de seguridad en una aplicación Spring Boot utilizando Spring Security.

La aplicación simula un sistema interno para una clínica veterinaria, donde existen distintas áreas de acceso según el tipo de usuario. El objetivo principal es demostrar el uso de autenticación, autorización por roles, protección de rutas, formulario de login personalizado y cierre de sesión.

Durante el desarrollo se configuraron dos usuarios en memoria: un usuario administrador y un usuario general. El administrador puede acceder a todas las secciones del sistema, mientras que el usuario general solo puede ingresar a las páginas públicas o asignadas a su rol.

Además, durante las pruebas se observó que, al mostrar directamente las autoridades del usuario autenticado, Spring Security también imprimía información técnica adicional con números, letras y una fecha interna relacionada con el factor de autenticación. Esa información no correspondía a una contraseña ni representaba un riesgo directo como credencial visible, pero podía verse confusa y poco profesional en la interfaz.

Por ese motivo, se ajustó el controlador para filtrar únicamente los roles principales del usuario, mostrando solo valores como `ROLE_ADMIN` o `ROLE_USER`. Con este cambio, la interfaz queda más clara, ordenada y adecuada para una entrega académica, evitando exponer detalles técnicos internos que no son necesarios para el usuario final.

## Objetivo

Implementar seguridad en una aplicación web utilizando Spring Security, aplicando autenticación en memoria, roles de usuario, control de acceso por rutas y un formulario de login personalizado.

## Funcionalidades principales

* Página pública accesible para cualquier visitante.
* Login personalizado.
* Autenticación en memoria.
* Usuario administrador con rol `ADMIN`.
* Usuario general con rol `USER`.
* Página de bienvenida que muestra el usuario conectado y su rol.
* Área de usuario protegida.
* Área de administrador restringida solo para usuarios con rol `ADMIN`.
* Página de acceso denegado.
* Cierre de sesión con redirección al login.
* Diseño visual adaptado a un contexto veterinario.

## Usuarios de prueba

| Usuario | Contraseña | Rol   |
| ------- | ---------- | ----- |
| admin   | admin123   | ADMIN |
| user    | user123    | USER  |

## Rutas principales

| Ruta               | Acceso                                   |
| ------------------ | ---------------------------------------- |
| `/`                | Pública                                  |
| `/login`           | Pública                                  |
| `/bienvenida`      | Usuarios autenticados                    |
| `/usuario`         | USER y ADMIN                             |
| `/admin`           | Solo ADMIN                               |
| `/acceso-denegado` | Página informativa de acceso restringido |

## Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Security
* Thymeleaf
* Maven
* HTML
* CSS
* IntelliJ IDEA
* Git y GitHub

## Estructura general del proyecto

```text
VetSecurityCare
├── src
│   └── main
│       ├── java
│       │   └── cl.veterinaria.vetsecuritycare
│       │       ├── config
│       │       │   └── SecurityConfig.java
│       │       ├── controller
│       │       │   └── HomeController.java
│       │       └── VetSecurityCareApplication.java
│       └── resources
│           ├── static
│           │   └── css
│           │       └── styles.css
│           ├── templates
│           │   ├── acceso-denegado.html
│           │   ├── admin.html
│           │   ├── bienvenida.html
│           │   ├── login.html
│           │   ├── publico.html
│           │   └── usuario.html
│           └── application.properties
└── pom.xml
```

## Cómo ejecutar el proyecto

1. Clonar el repositorio o descargar el proyecto.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar que Maven cargue las dependencias.
4. Ejecutar la clase principal:

```text
VetSecurityCareApplication.java
```

5. Abrir en el navegador:

```text
http://localhost:8080
```

## Pruebas realizadas

Se realizaron pruebas de acceso con ambos usuarios definidos en memoria.

Con el usuario `user`, el sistema permite ingresar a la página de bienvenida y al área de usuario, pero bloquea el acceso al panel de administración.

Con el usuario `admin`, el sistema permite ingresar a todas las secciones, incluyendo el área administrativa.

También se verificó el cierre de sesión, confirmando que el sistema redirige correctamente al login y muestra el mensaje de sesión cerrada.

## Contexto veterinario aplicado

El proyecto fue adaptado a un contexto de clínica veterinaria, simulando un sistema interno donde el personal puede acceder a secciones generales y el administrador puede ingresar a áreas más sensibles, como gestión de permisos, personal o información interna.

Este enfoque permite relacionar los contenidos técnicos del módulo con un escenario profesional cercano al área de Medicina Veterinaria.

## Estado del proyecto

Proyecto finalizado y probado correctamente con compilación exitosa mediante Maven.

```text
BUILD SUCCESS
```

## Autora

Desarrollado por Jannabitte Pino Urra, como parte del Módulo 6 del curso Java Full Stack.
