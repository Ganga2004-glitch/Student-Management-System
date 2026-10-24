-- Student Management System Database

CREATE DATABASE IF NOT EXISTS java_practice;

USE java_practice;

-- Create students table
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

-- Display table structure
DESCRIBE students;

-- Display all student records
SELECT * FROM students;