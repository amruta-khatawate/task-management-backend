# Task Manager Backend

Spring Boot REST API for a task management app — full CRUD over tasks, consumed by an Angular frontend.

**Live API:** [task-management-backend-xsos.onrender.com](https://task-management-backend-xsos.onrender.com)

[Task Manager dashboard](image.png)

> **Demo note:** the deployed instance is on Render's free tier with an H2 in-memory
> database. It sleeps after ~15 minutes idle (first request can take 30–60s to wake),
> and all data is reset on every restart or deploy. 



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
