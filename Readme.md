
# Ride Hailing System

A backend service that simulates the core functionality of a ride-hailing platform.
This project focuses on **ride booking, driver management, and trip lifecycle handling** using a clean and scalable backend architecture built with Spring Boot.

The goal is to practice **real-world backend engineering concepts** such as modular architecture, REST APIs, database design, and event-driven systems.

---

# Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **PostgreSQL**
* **Hibernate**
* **Maven**
* **Bean Validation**

---

# Current Features

- User registration (Rider / Driver)
- Input validation using Spring Validation
- Duplicate email prevention
- Driver profile management
- Driver availability status (ONLINE / OFFLINE)
- Clean layered architecture (Controller → Service → Repository)
- PostgreSQL integration using JPA/Hibernate

---

# Project Structure

```
com.ashar.ride_hailing_system

├── common
│   └── enums
│       ├── UserRole
│       └── DriverStatus
│
├── user
│   ├── controller
│   │   └── UserController
│   │
│   ├── dto
│   │   └── RegisterRequest
│   │
│   ├── entity
│   │   ├── User
│   │   └── DriverProfile
│   │
│   ├── repository
│   │   ├── UserRepository
│   │   └── DriverProfileRepository
│   │
│   └── service
│       └── UserService
│
├── exception
├── RideHailingSystemApplication
```

This modular structure allows easy migration to **microservices in the future**.

---

# Database Configuration

`application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ridedb
spring.datasource.username=ashar
spring.datasource.password=****

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# Database Design

### Users Table

| Column | Type    | Description     |
| ------ | ------- | --------------- |
| id     | BIGINT  | Primary key     |
| name   | VARCHAR | User name       |
| email  | VARCHAR | Unique email    |
| role   | VARCHAR | RIDER or DRIVER |

---

### Driver Profiles Table

| Column  | Type    | Description         |
| ------- | ------- | ------------------- |
| id      | BIGINT  | Primary key         |
| user_id | BIGINT  | Foreign key → Users |
| status  | VARCHAR | ONLINE / OFFLINE    |

---

# API Endpoints

### Register User

**POST**

```
/api/users/register
```

Body Example

```json
{
  "name": "Ashar",
  "email": "ashar@example.com",
  "role": "RIDER"
}
```

Driver Example

```json
{
  "name": "Driver1",
  "email": "driver1@example.com",
  "role": "DRIVER"
}
```

---

# What I Learned So Far

* Designing **REST APIs using Spring Boot**
* Structuring backend applications using **layered architecture**
* Using **JPA & Hibernate for ORM**
* Implementing **DTOs for request handling**
* Applying **input validation with Spring Validation**
* Managing **entity relationships using JPA**
* Integrating **PostgreSQL with Spring Boot**
* Preventing **duplicate data using repository queries**

---

# Upcoming Features

* Driver availability management API
* Ride request creation
* Automatic driver assignment
* Ride lifecycle management (Requested → Accepted → Completed)
* Driver location tracking
* Event-driven architecture using **Apache Kafka**
* Microservice architecture
* Authentication & authorization (JWT)
* Redis caching
* Docker deployment

---

# Project Goal

To build a **scalable backend architecture for a ride-hailing platform** while learning real-world backend engineering concepts.

The project is designed to gradually evolve from a **modular monolith to an event-driven microservices architecture**.

---

# Author

**Ashar Arif**

Software Developer (Learning & Building Real-World Systems)

LinkedIn:
https://www.linkedin.com/in/ashararif/
