# OneVet API - API REST para Gestión de Productos

Proyecto individual desarrollado para el **Módulo 6 - Desarrollo de Aplicaciones JEE con Spring Framework**, correspondiente al **Aprendizaje Esperado N°5**.

El objetivo principal de este trabajo fue construir una **API REST con Spring Boot y Spring MVC** para gestionar productos, permitiendo registrar, consultar, actualizar y eliminar información mediante operaciones HTTP.

La temática visual del proyecto se relaciona levemente con el área veterinaria, utilizando productos de ejemplo orientados al cuidado animal, sin perder el enfoque principal de la actividad: demostrar el funcionamiento de una API REST con respuestas en formato JSON.

---

## Objetivo del proyecto

Desarrollar una API REST que permita gestionar productos mediante las siguientes operaciones:

* Listar todos los productos.
* Consultar un producto por su ID.
* Crear un nuevo producto.
* Actualizar un producto existente.
* Eliminar un producto.

---

## Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring MVC
* Spring Data JPA
* H2 Database
* Maven
* HTML
* CSS
* JavaScript
* IntelliJ IDEA
* Git y GitHub

---

## Estructura principal del proyecto

```text
OneVetAPI
├── api-productos.http
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   └── cl.onevet.onevetapi
│       │       ├── controller
│       │       │   ├── HomeController.java
│       │       │   └── ProductoController.java
│       │       ├── model
│       │       │   └── Producto.java
│       │       ├── repository
│       │       │   └── ProductoRepository.java
│       │       ├── DataLoader.java
│       │       └── OneVetApiApplication.java
│       └── resources
│           ├── static
│           │   ├── index.html
│           │   ├── productos.html
│           │   ├── css
│           │   │   └── style.css
│           │   └── img
│           │       └── fondo-onevet.png
│           └── application.properties
```

---

## Entidad Producto

La entidad principal del proyecto es `Producto`, la cual contiene los atributos solicitados en la actividad:

```java
private Long id;
private String nombre;
private String descripcion;
private Double precio;
private Integer stock;
```

Esta entidad se encuentra anotada con `@Entity`, permitiendo que Spring Data JPA la utilice como representación de una tabla en la base de datos.

---

## Endpoints de la API REST

La API expone las siguientes rutas:

| Método | Ruta              | Descripción                            |
| ------ | ----------------- | -------------------------------------- |
| GET    | `/productos`      | Lista todos los productos registrados  |
| GET    | `/productos/{id}` | Consulta un producto específico por ID |
| POST   | `/productos`      | Crea un nuevo producto                 |
| PUT    | `/productos/{id}` | Actualiza un producto existente        |
| DELETE | `/productos/{id}` | Elimina un producto por ID             |

---

## Ejemplo de producto en JSON

```json
{
  "nombre": "Shampoo dermatológico",
  "descripcion": "Producto veterinario para cuidado de piel sensible",
  "precio": 8990,
  "stock": 15
}
```

---

## Pruebas de la API

Para probar las operaciones CRUD se incorporó el archivo:

```text
api-productos.http
```

Desde este archivo se pueden ejecutar solicitudes directamente en IntelliJ para probar:

```http
GET http://localhost:8080/productos
POST http://localhost:8080/productos
PUT http://localhost:8080/productos/1
DELETE http://localhost:8080/productos/2
```

---

## Base de datos H2

El proyecto utiliza una base de datos H2 en memoria, lo que permite probar la aplicación sin instalar una base de datos externa.

La consola H2 se encuentra disponible en:

```text
http://localhost:8080/h2-console
```

Datos de conexión:

```text
JDBC URL: jdbc:h2:mem:onevetdb
User Name: sa
Password: 
```

La contraseña debe quedar vacía.

---

## Carga inicial de datos

Se agregó la clase `DataLoader`, que permite cargar productos iniciales cada vez que se inicia la aplicación.

Esto evita que la API aparezca vacía al ingresar a:

```text
http://localhost:8080/productos
```

Productos cargados inicialmente:

* Shampoo dermatológico
* Alimento clínico renal
* Suplemento articular

---

## Vista visual del proyecto

Además de la API REST, se agregó una página inicial para presentar el proyecto de forma más ordenada y visual.

Rutas disponibles:

```text
http://localhost:8080
```

Página inicial con imagen de fondo y descripción del proyecto.

```text
http://localhost:8080/productos.html
```

Vista visual que consume el endpoint `GET /productos` y muestra los productos registrados de forma más clara.

```text
http://localhost:8080/productos
```

Respuesta JSON original de la API REST.

Es importante mencionar que la ruta `/productos` se visualiza como JSON simple porque corresponde directamente a la respuesta de la API, mientras que `productos.html` presenta esos mismos datos de forma más amigable para el usuario.

---

## Ejecución del proyecto

Para ejecutar el proyecto desde la terminal:

```bash
mvn spring-boot:run
```

Para ejecutar las pruebas:

```bash
mvn test
```

Para compilar y empaquetar el proyecto:

```bash
mvn package
```

El proyecto fue validado correctamente con:

```text
BUILD SUCCESS
```

---

## Aprendizaje desarrollado

Con este trabajo pude aplicar el desarrollo de una API REST utilizando Spring Boot, Spring MVC y Spring Data JPA. También reforcé el uso de rutas HTTP, respuestas JSON, persistencia con H2 y organización de un proyecto Maven.

Además, incorporé una vista visual simple para complementar la presentación del proyecto, manteniendo el enfoque principal en la construcción y prueba de la API REST solicitada.

---

## Estado del proyecto

Proyecto funcional

La API permite realizar correctamente las operaciones de:

* Crear productos.
* Consultar productos.
* Actualizar productos.
* Eliminar productos.
* Visualizar datos en formato JSON.
* Revisar información desde la consola H2.

  ## Autora

  Creado por Jannabitte Pino Estudiante en formacion,2026.
