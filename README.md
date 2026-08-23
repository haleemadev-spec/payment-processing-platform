# Payment Processing Platform

A backend payment processing platform built with Java and Spring Boot.

## Overview

This project provides a REST API for managing payment transactions. It is designed with a focus on clean backend architecture, data persistence, security, containerization, and automated testing.

## Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Spring Security
- Docker
- Testcontainers
- JUnit
- Maven

## Features

- Payment creation and management
- Payment status management
- REST API endpoints
- PostgreSQL persistence
- Spring Security configuration
- Docker-based development environment
- Integration testing with Testcontainers
- Request validation

## Project Structure

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
│
└── test/
    ├── java/
    └── resources/

## Running the Application

### Prerequisites

- Java 21
- Docker Desktop

### Build

On Windows:

.\mvnw.cmd clean verify

### Run

.\mvnw.cmd spring-boot:run

### Testing

.\mvnw.cmd test

The project uses JUnit and Testcontainers for integration testing.

## API

The application exposes REST endpoints for payment processing.

### Create a payment

POST /api/payments
Content-Type: application/json

Example request:

{
  "amount": 100.00,
  "currency": "EUR",
  "sender": "Haleema",
  "receiver": "Test"
}

### Get all payments

GET /api/payments

### Get a payment by ID

GET /api/payments/{id}

## Architecture

The application follows a layered backend architecture:

Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL

This separation keeps API handling, business logic, and data access independent and maintainable.

## Payment Lifecycle

PENDING
   ↓
PROCESSING
   ↓
COMPLETED

A payment can also transition to:

FAILED
CANCELLED

## Testing

The project has been tested using Maven, JUnit, and Testcontainers.

The integration environment uses Docker to provide the required containerized services.

## Author

Halimatou Diallo
## Author

Halimatou Diallo
