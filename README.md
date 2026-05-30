# 📌 Employee Management System (JDBC)
[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8+-green)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

A Java-based Employee Management System built using JDBC and MySQL.
This project demonstrates a complete CRUD application with a layered architecture including DAO, Service, and Model layers.

A simple **Java-based Employee Management System** that allows users to add, view, search, update, and delete contacts. This project uses **JDBC** to connect with a **MySQL database** and demonstrates a full CRUD application using **Java**, **DAO pattern**, and **service layer architecture**.
---

## Features

- **➕ Add new employee:** Store a new employee with name, phone, and email,phone,salary.
- **📄 View all employees:** Display all employees stored in the database.
- **🔍 Search employee by ID:** Search for a employee by id.
- **✏️ Update employee details:** Update the details of a contact by ID.
- **❌ Delete employee:** Remove a employee by id.
- **💾 MySQL database integration:** Prevent empty or invalid inputs for name, phone, and email,salary.
- **🧱 Layered architecture** (Model → DAO → Service → UI)
- **Database Integration:** Uses MySQL to store contact information.

---

## Technologies Used

- **Java 17+**
- **MySQL 8+**
- **JDBC** for database connectivity
- **DAO Design Pattern** for database operations
- **Service Layer** for business logic
- **Console-based UI** using `Scanner`

---

## Project Structure
- Employee_Management_System/

  ─ src/
  
  ─ Employee_Management_System/
    - DAO/
      - EmployeeDAO.java
    ─ model/
      ─ Employee.java
    ─ service/
      ─ EmployeeService.java
    ─ util/
      ─ DBConnection.java
    ─ Main.java
    ─ README.md
    ─ pom.xml (if using Maven)
---

## Setup & Run ⚡

### 1. Database Setup

```sql

## 1. Create Database
CREATE DATABASE employee;

USE employee;

## 2. Create Contact Table
CREATE TABLE emp
(
emp_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
phone VARCHAR(15) NOT NULL,
salary DECIMAL(10,2) NOT NULL DEFAULT 0
);

SELECT * FROM emp;


```
## 2. Update DBConnection.java with your MySQL credentials
private static final String url = "jdbc:mysql://127.0.0.1:3306/employee";
private static final String username = "root";

private static final String password = "YOUR_PASSWORD";
## 3. How to Run

Usage Example
=========Employee MANAGEMENT SYSTEM==========
1. Add New Employee
2. View All
3. Search
4. Update
5. Delete
6. Exit
Enter your choice: 1
Name: John Doe
Email: john@example.com
Phone: 1234567890
Salary: 800045
✅ Employee added successfully

---
## 🧠 Learning Outcomes

- JDBC database connectivity
- CRUD operations in Java
- DAO pattern implementation
- Layered architecture design
- Input validation & exception handling


----

## 🔮 Future Improvements

- Spring Boot REST API version
- JavaFX GUI version
- Authentication system
- Logging using Log4j/SLF4J
- Global exception handling

---
## License 📝
This project is open-source and available under the MIT License.

Author

Mayank Kapoor
GitHub: https://github.com/kapoormayank9696

---

If you want, I can also **make a shorter, more attractive GitHub-ready version** that looks modern with badges for Java, MySQL, and license.  

Do you want me to do that version too?

