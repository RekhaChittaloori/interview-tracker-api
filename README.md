# Interview Tracker API

A Spring Boot REST API for tracking job applications and interviews.

## Features
- User Management
- Interview Tracking
- Dashboard Statistics
- Validation
- Global Exception Handling
- Swagger Documentation

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger/OpenAPI
- Postman

## API Endpoints
- GET /users
- POST /users
- GET /interviews
- POST /interviews
- GET /interviews/status/{status}
- GET /dashboard

## Run Locally
1. Clone repository
2. Configure MySQL in application.properties
3. Run:
   mvn spring-boot:run

## Swagger
http://localhost:8080/swagger-ui/index.html
