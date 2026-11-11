# Payment Processing Platform

A backend payment processing application built with Java 21 and Spring Boot.

## Overview

Payment Processing Platform is a RESTful backend application designed to manage payment transactions. It provides endpoints for creating payments, retrieving payment records, and tracking payment statuses.

The project focuses on clean backend architecture, data persistence, security configuration, containerization, and automated testing.

## Tech Stack

- **Java 21**
- **Spring Boot 3.5.3**
- **Spring Data JPA**
- **Spring Security**
- **PostgreSQL**
- **Redis**
- **Docker & Docker Compose**
- **Maven**
- **JUnit 5**
- **Testcontainers**

## Features

- Payment creation and management
- Payment status management
- REST API endpoints
- PostgreSQL data persistence
- Request validation
- Spring Security configuration
- Docker-based development environment
- Integration testing with Testcontainers

## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com.haleema.payment/
│   │       ├── config/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
└── test/
    ├── java/
    └── resources/
```

## Running the Application

### Prerequisites

- Java 21
- Docker Desktop

### Build

On Windows:

```bash
.\mvnw.cmd clean verify
```

### Run

On Windows:

```bash
.\mvnw.cmd spring-boot:run
```

### Start Docker Services

```bash
docker compose up -d
```

## Testing

Run the tests using Maven:

```bash
.\mvnw.cmd test
```

The project uses JUnit and Testcontainers for its testing environment.

## API Documentation

The application exposes REST endpoints for payment management.

### Create a Payment

```http
POST /api/payments
```

Example request:

```json
{
  "amount": 100.00,
  "currency": "EUR",
  "sender": "Haleema",
  "receiver": "Test"
}
```

### Get All Payments

```http
GET /api/payments
```

### Get Payment by ID

```http
GET /api/payments/{id}
```

## Payment Lifecycle

The application defines the following payment statuses:

- `PENDING`
- `PROCESSING`
- `COMPLETED`
- `FAILED`
- `CANCELLED`

## Architecture

The application follows a layered backend architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

This separation keeps API handling, business logic, and data access independent and maintainable.

## Author

**Halimatou Diallo**

GitHub: [@haleemadev-spec](https://github.com/haleemadev-spec)
