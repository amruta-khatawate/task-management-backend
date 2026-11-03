# Task Manager – Spring Boot Backend

A RESTful backend application developed using Java and Spring Boot for the Task Manager application.

This repository contains the backend implementation responsible for handling task-related operations, processing API requests from the Angular frontend, and managing task data using Spring Data JPA and an H2 in-memory database.


#### Related Repository:

*Frontend:* If you'd like to explore the Angular frontend of this project, check out the [Task Manager – Angular Frontend](https://github.com/amruta-khatawate/task-management-dashboard) repository.


#### Overview:

The application follows a layered architecture to maintain separation of concerns and improve code organization.

The backend exposes RESTful APIs that allow the frontend application to perform CRUD (Create, Read, Update, Delete) operations on tasks.

**Tech Stack** :
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 In-Memory Database
- Maven
- RESTful Web Services
- Postman


#### Prerequisites:

Before running the application, configure the environment-specific settings[application.properties].

example configuration for H2:

```properties
spring.application.name=task-manager

spring.datasource.url=jdbc:h2:mem:DATABASE_NAME
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=USERNAME
spring.datasource.password=PASSWORD

spring.jpa.defer-datasource-initialization=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true

server.port=8080
```

**Important:** These are example local-development settings. Adjust them according to your project configuration.
Use the JDBC URL, username, and password configured in your application properties.
**Note:** H2 is configured as an in-memory database. Data is temporary and is lost when the application shuts down.
