create table docenti(
codice int auto_increment primary key,
cf char(16),
cognome varchar(50),
nome varchar(50),
abilitazione varchar(20)
);

alter table docenti
change abilitazione classe_conscorso varchar(20);

alter table docenti
change cf codice_fiscale varchar(50);

alter table docenti
add column ruolo bool;

alter table docenti
drop column citta;

alter table docenti
drop column telefono;

alter table docenti
change classe_conscorso classe_conscorso varchar(20) not null;