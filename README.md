Role Base Access System
This is a JWT Authentication System built with Java, Spring Boot, Spring Security, and MySQL. The system demonstrates user registration, login, and role-based access for both Admin and User roles. JWT tokens are used to authenticate and authorize users.

Features
User Registration: Users can register with their details (e.g., first name, last name, email, etc.).
Login: Users can log in with their credentials and receive a JWT token for authentication.
Role-Based Access: Admin and User roles have different access levels to various endpoints.
Secure Authentication: JWT tokens are used to protect endpoints from unauthorized access.
Technologies Used
Java 17
Spring Boot (v3.1.0)
Spring Security (JWT Authentication)
MySQL for database storage
Lombok for reducing boilerplate code
JWT (JSON Web Tokens) for authentication
API Endpoints
Authentication
POST /api/v1/auth/register: Register a new user.
POST /api/v1/auth/login: Login and get a JWT token.
User
GET /api/v1/user: Access for normal users.
Admin
GET /api/v1/admin: Access for admin users only.
Setup & Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/jwt-authentication-system.git
Set up MySQL:

Create a MySQL database and update the application.properties file with your credentials.
Run the application:

bash
Copy code
./mvnw spring-boot:run
Test the API using Postman or any API testing tool:

Register a user via /api/v1/auth/register.
Login via /api/v1/auth/login to receive the JWT token.
Use the token to access protected routes.
How It Works
Registration: Users send a POST request with their details to the /register endpoint.
Login: After registration, users send their email and password to /login to receive a JWT token.
Accessing Routes: Users include the JWT token in the Authorization header to access restricted routes.
HR Validation
This project demonstrates key concepts such as:

Spring Boot security and JWT-based authentication.
Role-based access control (RBAC).
Database integration with MySQL.
Clean and maintainable code following industry standards.
