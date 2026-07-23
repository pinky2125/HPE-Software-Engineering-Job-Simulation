# 🚀 HPE Software Engineering Job Simulation

This repository contains my solution for the **Hewlett Packard Enterprise (HPE) Software Engineering Job Simulation** offered through Forage.

## 📌 Project Overview

In this simulation, I developed a RESTful web service using **Java** and **Spring Boot**. The project demonstrates the implementation of REST APIs, JSON data handling, and unit testing.

## ✨ Features

- Retrieve all employees using HTTP GET
- Add a new employee using HTTP POST
- JSON request and response handling
- Employee management using Java collections
- Unit testing using JUnit
- Built using Gradle

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Gradle
- REST API
- JSON
- JUnit
- Git & GitHub

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com/example/restservice
│   │       ├── Employee.java
│   │       ├── Employees.java
│   │       ├── EmployeeController.java
│   │       ├── EmployeeManager.java
│   │       └── RestServiceApplication.java
│   └── resources
│       └── application.properties
│
└── test
    └── java
        └── com/example/restservice
            └── EmployeeControllerTest.java
```

## 📡 REST API Endpoints

### Get All Employees

```http
GET /employees
```

### Add New Employee

```http
POST /employees
```

### Sample JSON

```json
{
  "employee_id": "EMP005",
  "first_name": "Vaishnavi",
  "last_name": "Patil",
  "email": "vaishnavi@gmail.com",
  "title": "Java Developer"
}
```

## ▶️ How to Run

Clone the repository:

```bash
git clone https://github.com/pinky2125/HPE-Software-Engineering-Job-Simulation.git
```

Move into the project:

```bash
cd HPE-Software-Engineering-Job-Simulation
```

Run the application:

```bash
./gradlew bootRun
```

Application runs on:

```
http://localhost:8080
```

## 🧪 Running Unit Tests

```bash
./gradlew test
```

## 📜 Certificate

This project was completed as part of the **Hewlett Packard Enterprise Software Engineering Job Simulation** on Forage.

## 👩‍💻 Author

**Vaishnavi Patil**

GitHub: https://github.com/pinky2125