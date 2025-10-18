alter table Studenti add dipartimento varchar(50);

alter table Studenti drop column dipartimento;

alter table Studenti change column cognome cognome char(20) not null after studenti;

alter table Studenti change column cognome cognome char(20) not null first;