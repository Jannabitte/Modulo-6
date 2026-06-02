# Gestor de Pendientes con Spring Boot MVC

## Descripción del proyecto

Este proyecto corresponde al Aprendizaje Esperado N°2 del Módulo 6 de Spring Framework. La actividad consiste en desarrollar una aplicación web utilizando Spring Boot MVC, permitiendo registrar, almacenar en memoria y visualizar pendientes mediante un formulario y una tabla.

Para personalizar el trabajo, orienté el sistema hacia un contexto veterinario, simulando un gestor de pendientes para una clínica o atención profesional. De esta forma, los pendientes pueden representar tareas como vacunaciones, controles de pacientes, llamados a tutores, revisión de fichas clínicas u otras actividades importantes dentro de una gestión veterinaria.

## Objetivo

Desarrollar una aplicación web sencilla que permita gestionar pendientes utilizando Spring Boot MVC, aplicando una estructura organizada por capas: modelo, servicio, controlador y vistas.

## Funcionalidades principales

* Registro de pendientes mediante formulario web.
* Captura de los datos:

  * Nombre del pendiente.
  * Descripción.
  * Fecha límite.
* Almacenamiento de los pendientes en memoria.
* Visualización de los pendientes registrados en una tabla.
* Navegación entre el formulario y la lista de pendientes.
* Diseño visual personalizado con CSS.
* Pruebas básicas del controlador con JUnit.

## Tecnologías utilizadas

* Java 21.
* Spring Boot.
* Spring Web.
* Thymeleaf.
* Spring Boot DevTools.
* Maven.
* JUnit 5.
* HTML.
* CSS.
* Git y GitHub.
* IntelliJ IDEA.

## Estructura del proyecto

```text
PendientesSpringVet
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.jannabitte.pendientesspringvet
│   │   │       ├── controlador
│   │   │       │   └── PendienteController.java
│   │   │       ├── modelo
│   │   │       │   └── Pendiente.java
│   │   │       ├── servicio
│   │   │       │   ├── PendienteService.java
│   │   │       │   └── PendienteServiceImpl.java
│   │   │       └── PendientesSpringVetApplication.java
│   │   └── resources
│   │       ├── static
│   │       │   └── css
│   │       │       └── estilos.css
│   │       ├── templates
│   │       │   ├── formulario.html
│   │       │   └── lista.html
│   │       └── application.properties
│   └── test
│       └── java
│           └── com.jannabitte.pendientesspringvet
│               └── controlador
│                   └── PendienteControllerTest.java
└── pom.xml
```

## Explicación de las capas

### Modelo

La clase `Pendiente` representa cada tarea registrada en el sistema. Contiene los atributos solicitados en la actividad:

* `nombre`
* `descripcion`
* `fechaLimite`

Esta clase funciona como el objeto principal que transporta la información ingresada desde el formulario.

### Servicio

La capa de servicio está compuesta por una interfaz y una implementación:

* `PendienteService`
* `PendienteServiceImpl`

La interfaz define los métodos principales del sistema, mientras que la implementación administra una lista de pendientes en memoria. Esto permite separar la lógica de negocio del controlador y mantener el código más ordenado.

### Controlador

La clase `PendienteController` se encarga de recibir las solicitudes del usuario y responder con las vistas correspondientes.

Sus responsabilidades principales son:

* Mostrar el formulario de registro.
* Recibir los datos enviados desde el formulario.
* Guardar el pendiente en memoria.
* Enviar la lista de pendientes a la vista correspondiente.

### Vistas

El proyecto utiliza Thymeleaf para conectar los datos del backend con las páginas HTML.

Las vistas creadas son:

* `formulario.html`: permite registrar un nuevo pendiente.
* `lista.html`: muestra los pendientes registrados en una tabla.

## Almacenamiento en memoria

Los pendientes se almacenan en una lista en memoria dentro de la clase `PendienteServiceImpl`.

Esto significa que los datos se mantienen solamente mientras la aplicación está en ejecución. Si el proyecto se detiene o se reinicia, la lista vuelve a estar vacía.

Este comportamiento fue utilizado porque la actividad solicita almacenar los pendientes en memoria, sin conexión a una base de datos.

## Pruebas realizadas

Se creó la clase `PendienteControllerTest` para verificar el funcionamiento básico del controlador.

Las pruebas revisan que:

* El formulario se muestre correctamente.
* Un pendiente pueda ser guardado.
* La lista de pendientes se pueda visualizar.
* Las vistas retornadas por el controlador sean las esperadas.

Resultado de las pruebas:

```text
3 tests passed
```

## Ejecución del proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto `PendientesSpringVet`.
2. Verificar que esté configurado con Java 21.
3. Ejecutar la clase principal:

```text
PendientesSpringVetApplication
```

4. Abrir en el navegador:

```text
http://localhost:8080/
```

## Rutas principales

| Ruta       | Descripción                                            |
| ---------- | ------------------------------------------------------ |
| `/`        | Muestra el formulario para registrar pendientes.       |
| `/guardar` | Recibe los datos del formulario y guarda el pendiente. |
| `/lista`   | Muestra la tabla con los pendientes registrados.       |

## Comandos utilizados

Para revisar el estado del proyecto en Git:

```bash
git status
```

Para crear la rama del trabajo:

```bash
git switch -c pendientes-spring-mvc
```

Para agregar los cambios:

```bash
git add .
```

Para crear el commit:

```bash
git commit -m "Crea gestor de pendientes con Spring Boot MVC"
```

Para subir la rama al repositorio remoto:

```bash
git push -u origin pendientes-spring-mvc
```

## Rama del proyecto

Este trabajo fue desarrollado en la rama:

```text
pendientes-spring-mvc
```

Dentro del repositorio:

```text
Modulo-6
```

## Reflexión personal

Este trabajo me permitió comprender mejor cómo se estructura una aplicación web con Spring Boot MVC. 
A diferencia de un proyecto Java básico, aquí pude ver cómo el formulario HTML se conecta con el controlador, cómo el controlador utiliza un servicio y cómo los datos se envían nuevamente a una vista para ser mostrados al usuario.

También me ayudó a entender la importancia de separar responsabilidades dentro del proyecto. El modelo representa los datos, el servicio administra la lógica y el controlador conecta la aplicación con las vistas. Esta organización permite que el código sea más claro, fácil de mantener y más parecido a una aplicación empresarial real.

Además, personalizar el proyecto hacia un contexto veterinario me permitió relacionar los contenidos técnicos del módulo con situaciones cercanas a mi área de interés, como la organización de tareas clínicas, controles de pacientes y actividades pendientes dentro de una atención veterinaria.

## Estado del proyecto

Proyecto finalizado correctamente.

* Aplicación ejecutada.
* Formulario probado.
* Lista de pendientes funcionando.
* Diseño CSS aplicado.
* Pruebas aprobadas.
* Package ejecutado correctamente.
* Rama subida a GitHub.
