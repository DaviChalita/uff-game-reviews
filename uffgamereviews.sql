DROP DATABASE IF EXISTS uffgamereviews ;
CREATE DATABASE uffgamereviews;

USE uffgamereviews;

CREATE TABLE user (
  email VARCHAR(45) NOT NULL,
  senha VARCHAR(45) NOT NULL,
  estrelas INT NOT NULL,
  PRIMARY KEY (email));

CREATE TABLE jogo (
  idJogo INT NOT NULL AUTO_INCREMENT,
  nota INT NOT NULL,
  descricao VARCHAR(280) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  icon VARCHAR(45) NOT NULL,
  rated_username VARCHAR(45) NOT NULL,
  PRIMARY KEY (idJogo),
    FOREIGN KEY (rated_username) REFERENCES user (email));
    
insert into user (email, senha, estrelas)
 values('chalitameneguelli14@gmail.com', '123', 10);

describe user;
select * from user;
describe jogo;
select * from jogo;