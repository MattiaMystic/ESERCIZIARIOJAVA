CREATE TABLE dipendenti (
    ID_dipendente INT auto_increment PRIMARY KEY,
    cognome VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    data_nascita DATE,
    cap CHAR(5),
    citta VARCHAR(50),
    anzianita INT,
    id_reparto INT
);