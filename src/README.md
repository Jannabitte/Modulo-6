# MavenVetCare

## Descripción de la actividad

MavenVetCare es un proyecto Java simple creado con Maven como gestor de proyectos. 
Fue desarrollado como parte del Módulo 6, con el objetivo de aplicar conocimientos sobre la creación de proyectos Java, administración de dependencias y ejecución de tareas del ciclo de vida de Maven.

El proyecto consiste en una aplicación de consola que imprime un mensaje de inicio relacionado con una gestión básica veterinaria. Aunque es un proyecto simple, permite demostrar el uso correcto de Maven, la configuración del archivo `pom.xml`, la incorporación de pruebas unitarias con JUnit y la generación de un archivo `.jar` ejecutable.

## Objetivo de la actividad

Aplicar conocimientos sobre el uso de Maven como gestor de proyectos, creando un proyecto Java simple, gestionando dependencias y ejecutando tareas del ciclo de vida del proyecto.

## Tecnologías utilizadas

* Java 21
* Maven
* JUnit 5
* IntelliJ IDEA
* Git

## Estructura del proyecto

```text
MavenVetCare
│
├── src
│   ├── main
│   │   └── java
│   │       └── cl.jannabitte.mavenvetcare
│   │           └── App.java
│   │
│   └── test
│       └── java
│           └── cl.jannabitte.mavenvetcare
│               └── AppTest.java
│
├── pom.xml
└── README.md
```

## Funcionalidad principal

La clase principal `App.java` ejecuta un mensaje en consola indicando que el sistema fue iniciado correctamente:

```text
Sistema MavenVetCare iniciado correctamente. Proyecto Java administrado con Maven.
```

Además, se creó una prueba unitaria en `AppTest.java`, utilizando JUnit 5, para validar que el mensaje entregado por la aplicación sea el esperado.

## Dependencia agregada

En el archivo `pom.xml` se agregó la dependencia de JUnit 5 para realizar pruebas unitarias:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

## Ciclo de vida Maven ejecutado

Durante el desarrollo se ejecutaron las siguientes fases del ciclo de vida de Maven:

```bash
mvn compile
```

Permite compilar el proyecto y generar los archivos `.class`.

```bash
mvn test
```

Ejecuta las pruebas unitarias definidas en el proyecto.

```bash
mvn package
```

Empaqueta el proyecto y genera el archivo `.jar`.

```bash
mvn install
```

Instala el artefacto generado en el repositorio local de Maven.

```bash
mvn clean
```

Limpia el proyecto eliminando la carpeta `target`.

## Ejecución del archivo JAR

Después de empaquetar el proyecto, se ejecutó el archivo `.jar` con el siguiente comando:

```bash
java -jar target/MavenVetCare-1.0-SNAPSHOT.jar
```

El resultado obtenido fue:

```text
Sistema MavenVetCare iniciado correctamente. Proyecto Java administrado con Maven.
```

## Evidencias realizadas

Para respaldar la actividad, se tomaron capturas de pantalla de:

* Creación y estructura del proyecto Maven.
* Configuración del archivo `pom.xml`.
* Ejecución de la clase principal.
* Ejecución de prueba unitaria con JUnit.
* Fase `compile` con resultado `BUILD SUCCESS`.
* Fase `test` con resultado `BUILD SUCCESS`.
* Fase `package` con resultado `BUILD SUCCESS`.
* Ejecución del archivo `.jar`.
* Fase `install` con resultado `BUILD SUCCESS`.
* Fase `clean` con resultado `BUILD SUCCESS`.

## Reflexión personal

Este proyecto me permitió comprender de forma práctica cómo Maven ayuda a ordenar y automatizar el ciclo de vida de un proyecto Java. Antes de usar Maven, muchas tareas como compilar, probar o empaquetar podían realizarse de forma manual, pero con esta herramienta se pueden ejecutar mediante comandos o desde el panel de Maven en IntelliJ.

También pude comprender mejor la importancia del archivo `pom.xml`, ya que desde ahí se configura la información principal del proyecto, sus dependencias y plugins. En este caso, se utilizó para incorporar JUnit 5 y para permitir la creación de un archivo `.jar` ejecutable.

Aunque MavenVetCare es una aplicación sencilla, representa una base importante para avanzar posteriormente hacia proyectos más completos con Spring Boot, Spring MVC, acceso a datos, seguridad y servicios REST.

## Autora

Proyecto desarrollado por Jannabitte Pino, como parte del proceso formativo del Módulo 6 de Desarrollo de Aplicaciones JEE con Spring Framework.
