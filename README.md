# Digital_library
Digital Library

Overview

The Digital Library project is a Spring Boot application that provides a structured way to manage books, users, and transactions. It uses Spring Boot, JPA, PostgreSQL, and Lombok for efficient backend development.

Features

Book management (Add, Update, Delete, View Books)

User registration and authentication

Borrowing and returning books

REST API for easy integration

PostgreSQL as the database

Technologies Used

Java 17

Spring Boot 3.4.4

Spring Data JPA

PostgreSQL

Lombok

Postman (for API testing)

Maven

Getting Started

Prerequisites

Install Java 17

Install PostgreSQL and create a database

Install Maven

Install Git and Postman

Clone the Repository

git clone https://github.com/neelrajsg/digital_library.git
cd digital_library

Configure Database

Update application.properties in src/main/resources/ with your PostgreSQL credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/digital_library
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Build and Run the Application

mvn clean install
mvn spring-boot:run

API Endpoints

Method

Endpoint

Description

GET

/books

Fetch all books

POST

/books

Add a new book

PUT

/books/{id}

Update book details

DELETE

/books/{id}

Remove a book

POST

/users/register

Register a user

POST

/borrow

Borrow a book

POST

/return

Return a book

Testing with Postman

Open Postman

Use the API endpoints mentioned above to test requests

Deployment

To deploy the application for free:

Push the project to GitHub:

git add .
git commit -m "Initial commit"
git push origin main

Use Render, Railway, or Fly.io for free deployment.
