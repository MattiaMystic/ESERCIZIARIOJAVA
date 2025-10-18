CREATE TABLE libri (
    isbn int auto_increment PRIMARY KEY,
    titolo VARCHAR(100) NOT NULL,
    autore VARCHAR(100) NOT NULL,
    argomento VARCHAR(50),
    editore VARCHAR(50),
    anno INT,
    edizione INT
);