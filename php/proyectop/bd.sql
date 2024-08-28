CREATE DATABASE IF NOT EXISTS miBaseDeDatos;
USE miBaseDeDatos;

CREATE TABLE office (
    id INT AUTO_INCREMENT PRIMARY KEY,
    office VARCHAR(255) NOT NULL
);

CREATE TABLE groups (
    id INT AUTO_INCREMENT PRIMARY KEY,
    groups VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    idoffice INT,
    idgroup INT,
    FOREIGN KEY (idoffice) REFERENCES office(id),
    FOREIGN KEY (idgroup) REFERENCES groups(id)
);