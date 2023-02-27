DROP DATABASE IF EXISTS jbooker;
CREATE DATABASE jbooker CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE jbooker;

CREATE TABLE book (
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title VARCHAR(200) NOT NULL,
  author VARCHAR(200) NOT NULL,
  isbn VARCHAR(50) NOT NULL,
  pages INT NOT NULL,
  price DOUBLE(10,2) NOT NULL
);

INSERT INTO book(title, author, isbn, pages, price) VALUES 
('Vermelho, Branco e Sangue Azul', 'Casey McQuiston', '978-34-265-2615-1', 392,49.99), 
(), 
(), 
(), 
();