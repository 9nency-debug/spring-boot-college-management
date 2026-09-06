# 🎓 College Management System

A backend project built with **Java and Spring Boot** for managing basic college-related operations and user accounts.

I built this project while learning backend development with Spring Boot. The main focus was understanding how REST APIs, databases, authentication, authorization, and JPA work together in a backend application.

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Security**
* **JWT**
* **Spring Data JPA**
* **Hibernate**
* **PostgreSQL**
* **Maven**
* **Lombok**
* **JavaMailSender**
* **JUnit 5**
* **Mockito**
* **Swagger / OpenAPI**

## ✨ Features

### Student

* Student registration
* Student login
* View profile
* Update profile
* Change password
* Forgot password
* Reset password

### Faculty

* Faculty registration
* Faculty login
* Role-based access

### Admin

* Admin registration
* Admin login
* Role-based authorization

### Authentication & Security

* JWT-based authentication
* Spring Security
* Role-based authorization
* BCrypt password hashing
* Protected REST endpoints
* Stateless authentication

## 🗃️ Database

The project uses **PostgreSQL** with Spring Data JPA and Hibernate.

Main entities include:

* Student
* Faculty
* Admin
* PasswordResetToken

### Student Information

```text
id
name
email
phone
password
branch
semester
enrollmentYear
address
city
pincode
```

### Faculty Information

```text
id
name
email
phone
password
department
designation
```

### Admin Information

```text
id
name
email
phone
password
role
```

## 🔐 JWT Authentication Flow

The basic authentication flow of the application is:

```text
Register
   ↓
Login
   ↓
JWT Token
   ↓
Send Token with Request
   ↓
Spring Security
   ↓
Access Protected API
```

For example:

```http
GET /api/student/profile
```

with:

```http
Authorization: Bearer <JWT_TOKEN>
```

## 🔗 Main API Endpoints

### Authentication

```http
POST /api/auth/student/register
POST /api/auth/student/login

POST /api/auth/faculty/register
POST /api/auth/faculty/login

POST /api/auth/admin/register
POST /api/auth/admin/login
```

### Password

```http
POST /api/auth/forgot-password
POST /api/auth/reset-password
POST /api/auth/change-password
```

### Student

```http
GET /api/student/profile
PUT /api/student/profile
```

## 🚀 How to Run

### Prerequisites

Make sure you have:

* Java 17 or later
* Maven
* PostgreSQL
* Git

### 1. Clone the Repository

```bash
git clone <your-repository-url>
cd college-management-system
```

### 2. Configure the Database

Create a PostgreSQL database and add your database details to the application configuration.

Example:

```text
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
```

You also need to configure:

```text
JWT_SECRET=your_secret_key

EMAIL_USERNAME=your_email
EMAIL_PASSWORD=your_app_password
```

> Do not upload your actual passwords, secret keys, or email credentials to GitHub.

### 3. Build the Project

```bash
mvn clean install
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

## 🧪 Testing

I used:

* **JUnit 5**
* **Mockito**
* **MockMvc**

To run the tests:

```bash
mvn test
```

The tests cover parts of the authentication and controller functionality.

## 📮 Testing APIs

The APIs can be tested using **Postman** or Swagger.

A basic student login flow is:

```text
1. Register student
        ↓
2. Login
        ↓
3. Get JWT token
        ↓
4. Add token to Authorization header
        ↓
5. Access protected profile API
```

## 📖 What I Learned

This project helped me practice:

* Creating REST APIs with Spring Boot
* Connecting Spring Boot with PostgreSQL
* Using JPA and Hibernate
* Creating entities, repositories, services, and controllers
* Understanding dependency injection
* Working with Spring Security
* Understanding JWT authentication
* Implementing role-based authorization
* Password hashing with BCrypt
* Handling API requests and responses
* Testing backend APIs
* Using Postman for API testing

## 🔮 Future Improvements

I would like to add more functionality as I learn more about Spring Boot, such as:

* Attendance management
* Course and subject management
* Marks management
* Fee management
* File uploads for assignments and notes
* Better notification system
* More API test cases
* Improved API documentation

## 👩‍💻 Author

**Nency Parmar**

B.Tech Information Technology Student

* GitHub: [9nency-debug](https://github.com/9nency-debug)
* LinkedIn: [Nency Parmar](https://www.linkedin.com/)
