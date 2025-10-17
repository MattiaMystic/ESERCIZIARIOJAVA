CREATE TABLE reparti (
    ID_reparto INT auto_increment PRIMARY KEY,
    nome_reparto VARCHAR(50) NOT NULL,
    cod_responsabile INT UNIQUE
);