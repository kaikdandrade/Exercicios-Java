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

/*
Dados falsos!!!
Data fake!!!
*/
INSERT INTO book(title, author, isbn, pages, price) VALUES 
('Vermelho, Branco e Sangue Azul', 'Casey McQuiston', '978-34-265-2615-1', 392, 49.90), 
('Lady Killers: Assassinas em Série', 'Tori Telfer', '527-31-937-7346-3', 384, 38.90),
('É assim que começa', 'Collen Hoover', '467-27-357-3015-7', 336, 29.90),
('Heartstopper', 'Alice Oseman', '951-68-201-8436-1', 288, 33.90),
('Os Sete maridos de Evelyn Hugo', 'Taylor Jenkins Reid', '357-20-431-5287-4', 360, 35.90),
('Birthday Girl', 'Penelope Douglas', '615-74-267-5761-8', 406, 89.90),
('Uma magia destilada em veneno', 'Judy I. Lin', '364-75-215-6438-6', 384, 33.90),
('O diário de Nisha', 'Veera Hiranandani', '301-87-436-3124-5', 288, 44.90),
('A hipótese do amor', 'Ali Hazelwood', '734-36-207-5204-2', 336, 32.90),
('Uma farsa de amor na Espanha', 'Elena Armas', '320-41-694-3684-9', 448, 47.90),
('Imperfeitos', 'Christina Lauren', '985-52-136-2208-0', 256, 27.90);