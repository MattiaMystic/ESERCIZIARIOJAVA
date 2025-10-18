create table Treno(
passeggiero int auto_increment primary key,
nome varchar(50),
cognome varchar(50),
numeroBiglietto int,
dataPartenza date,
presente bool,
prezzo decimal(4,2)

);