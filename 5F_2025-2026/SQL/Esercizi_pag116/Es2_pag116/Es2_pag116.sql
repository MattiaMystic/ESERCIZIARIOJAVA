create table libri(
isbn int auto_increment primary KEY,
titolo varchar(50),
autore varchar(50),
argomento varchar(50),
editore varchar(50),
anno int,
edizione int
);

alter table libri
change column anno anno_pubblicazione int;

alter table libri
add column cognome varchar(40);

alter table libri
add column nome varchar(40);

alter table libri
drop column autore;

alter table libri
change cognome autore_cognome varchar(40);

alter table libri
change nome autore_nome varchar(40);

alter table libri
change  autore_cognome  autore_cognome varchar(40) not null ;

alter table libri
change  autore_nome autore_nome varchar(40) not null ;
