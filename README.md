# Payment Processing Platform

A backend payment processing platform built with Java and Spring Boot.

## Overview

This project provides a REST API for managing payment transactions. It is designed with a focus on clean backend architecture, data persistence, security, containerization, and automated testing.

## Tech Stack

- Java
- Spring Boot
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
│
└── test/
    ├── java/
    └── resources/
