create table autori(
codice int auto_increment primary KEY,
cf char(16),
cognome varchar(50),
nome varchar(50),
citta varchar(50)

);

alter table autori 
change column cf codice_fiscale varchar(50);

alter table autori
add column indirizzo varchar(40);

alter table autori
add column cap char(5);

alter table autori
change column nome nome varchar(50) not null ;

alter table autori
change column cognome cognome varchar(50) not null ;


