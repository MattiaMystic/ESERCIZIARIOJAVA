use Clinica;

create table pazienti(
Id_paziente int auto_increment primary key,
cognome varchar(30) not null,
nome varchar(30) not null,
data_nascita date,
provincia char(2),
codice_Asl varchar(10)
);

create table visite(
Id_visita int auto_increment primary key,
data_visita date not null,
peso decimal(5,2),
pressione_min int,
pressione_max int,
glicemia decimal(5,2),
id_paziente int,
foreign key (id_paziente) references pazienti (Id_paziente));

select * from pazienti;

select * from visite;

