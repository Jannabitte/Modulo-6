# ProductManager Veterinario

## Descripción del proyecto

Este proyecto corresponde a una actividad individual del Módulo 6, enfocada en el desarrollo de aplicaciones JEE con Spring Framework. El objetivo principal fue crear un gestor de productos utilizando Spring Boot, Spring Data JPA, Thymeleaf y una base de datos, implementando operaciones CRUD completas.

Para personalizar la actividad según mis intereses, adapté el proyecto hacia el área de medicina veterinaria, creando una aplicación llamada **ProductManager Veterinario**. Esta permite gestionar productos relacionados con el cuidado, bienestar y manejo de animales, como shampoos dermatológicos, antiparasitarios, alimentos clínicos, suplementos y accesorios de transporte.

## Objetivo

Desarrollar una aplicación web que permita gestionar productos mediante operaciones básicas de mantenimiento de datos:

* Agregar nuevos productos.
* Listar productos registrados.
* Editar información de productos existentes.
* Eliminar productos almacenados.

## Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Thymeleaf
* H2 Database
* Maven
* HTML y CSS

## Estructura del proyecto

El proyecto fue organizado utilizando una arquitectura por capas:

```text
src/main/java/com/jannabitte/productmanager
│
├── controller
│   └── ProductoController.java
│
├── model
│   └── Producto.java
│
├── repository
│   └── ProductoRepository.java
│
├── service
│   └── ProductoService.java
│
├── DataLoader.java
└── ProductManagerApplication.java
```

## Funcionalidades implementadas

### Crear producto

La aplicación permite registrar nuevos productos veterinarios mediante un formulario web. Cada producto cuenta con nombre, descripción y precio.

### Listar productos

Los productos registrados se muestran en una tabla dentro de la página principal. Además, se cargan productos de ejemplo al iniciar la aplicación para visualizar mejor el funcionamiento del sistema.

### Editar producto

Cada producto puede ser modificado desde el botón **Editar**, lo que permite actualizar su nombre, descripción o precio.

### Eliminar producto

Cada registro puede ser eliminado desde el botón **Eliminar**, incorporando una confirmación antes de borrar el producto.

## Entidad principal

La entidad principal del proyecto es `Producto`, la cual contiene los siguientes atributos:

```java
private Integer id;
private String nombre;
private String descripcion;
private Double precio;
```

El campo `id` se genera automáticamente mediante JPA.

## Base de datos

Para esta actividad utilicé **H2 Database**, una base de datos en memoria que permite probar rápidamente el funcionamiento de la aplicación sin necesidad de configurar un motor externo.

La consola H2 queda disponible en:

```text
http://localhost:8080/h2-console
```

Con la siguiente URL JDBC:

```text
jdbc:h2:mem:productmanagerdb
```

## Personalización veterinaria

Aunque la actividad solicitaba un gestor de productos general, decidí orientar el proyecto al área veterinaria. Esto me permitió relacionar los contenidos técnicos del módulo con mi interés personal en medicina veterinaria, especialmente en productos asociados al bienestar animal, prevención, higiene, nutrición y cuidado responsable.

Además, se incorporó una imagen de fondo con temática veterinaria para mejorar la identidad visual del proyecto y hacerlo más cercano al contexto elegido.

## Ejecución del proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto `ProductManager`.
2. Esperar que Maven cargue las dependencias.
3. Ejecutar la clase principal:

```text
ProductManagerApplication.java
```

4. Abrir en el navegador:

```text
http://localhost:8080/productos
```

## Aprendizajes aplicados

En este proyecto apliqué conceptos importantes del módulo, tales como:

* Creación de proyectos con Spring Boot.
* Uso de entidades con JPA.
* Creación de repositorios con Spring Data JPA.
* Separación por capas: modelo, repositorio, servicio y controlador.
* Uso de Thymeleaf para vistas dinámicas.
* Implementación de operaciones CRUD.
* Uso de base de datos H2.
* Aplicación de transaccionalidad en la capa de servicio.

## Conclusión

Este proyecto me permitió comprender de forma práctica cómo se construye una aplicación web con Spring Boot y JPA, conectando la lógica de negocio con una base de datos y una interfaz visual. Además, al llevarlo al contexto veterinario, pude reforzar el aprendizaje técnico con un área de interés personal, desarrollando una solución simple, funcional y orientada al cuidado animal.
