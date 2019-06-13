DROP DATABASE IF EXISTS uffgamereviews ;
CREATE DATABASE uffgamereviews;

USE uffgamereviews;

CREATE TABLE user (
  email VARCHAR(45) NOT NULL,
  senha VARCHAR(45) NOT NULL,
  estrelas INT,
  PRIMARY KEY (email));

CREATE TABLE jogo (
  idJogo INT NOT NULL AUTO_INCREMENT,
  nota INT NOT NULL,
  descricao VARCHAR(280) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  icon VARCHAR(45) NOT NULL,
  PRIMARY KEY (idJogo)
)
