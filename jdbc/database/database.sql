



DROP DATABASE IF EXISTS jdbc_full_instructions;
CREATE DATABASE  jdbc_full_instructions;
USE jdbc_full_instructions;
CREATE TABLE employee(
id INT(15) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
gender BOOLEAN,
birth_date Date,
salary REAL
);

