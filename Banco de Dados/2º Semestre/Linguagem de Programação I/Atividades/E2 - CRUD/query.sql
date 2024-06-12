CREATE DATABASE CadeiraDB;
USE CadeiraDB;

CREATE TABLE Cadeiras (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    cor VARCHAR(255),
    material VARCHAR(255)
);

SELECT * FROM Cadeiras;
DROP table Cadeiras;