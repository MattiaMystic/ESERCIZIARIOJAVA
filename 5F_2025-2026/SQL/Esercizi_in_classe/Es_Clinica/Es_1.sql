create database if not exists mattia_pavarin_clinica;

use mattia_pavarin_clinica;

create table pazienti(
Id_paziente int auto_increment primary key,
cognome varchar(30) not null,
nome varchar(30) not null,
data_nascita date,
provincia varchar(50),
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

alter table visite add altezza decimal (5,2) after peso;

insert into pazienti(cognome,nome,data_nascita,provincia,codice_Asl )values
('Bianchi', 'Luca', '1985-04-10', 'Milano', 'ASL-MI01'),
('Rossi', 'Marco', '1990-07-23', 'Napoli', NULL),
('Verdi', 'Anna', '1978-12-01', 'Roma', 'ASL-RM05'),
('Neri', 'Giulia', '2000-02-14', 'Milano', 'ASL-MI03'),
('Esposito', 'Francesco', '1983-09-19', 'Napoli', 'ASL-NA07'),
('Conti', 'Marta', '1995-05-30', 'Roma', NULL);

select * from pazienti;

select * from visite;

insert into visite(data_visita,peso,altezza,pressione_min,pressione_max,glicemia,id_paziente)values
('2024-03-15', 70, 175, 80, 120, 95, 1),
('2024-06-10', 75, 175, 85, 125, 100, 1),
('2020-05-22', 92, 180, 95, 145, 112, 2),
('2020-11-03', 88, 178, 90, 135, 108, 5),
('2020-08-12', 89, 178, 85, 140, 115, 5),
('2025-01-09', 59, 160, 100, 150, 99, 3),
('2025-02-02', 65, 165, 85, 118, 100, 4),
('2025-09-05', 62, 165, 70, 110, 98, 4),
('2025-03-15', 58, 170, 95, 145, 85, 6);

INSERT INTO pazienti(cognome,nome,data_nascita,provincia,codice_Asl ) values 
('Cango', 'JOJO', '1983-09-19', 'Napoli', 'ASL-NA07');

insert into visite(data_visita,peso,altezza,pressione_min,pressione_max,glicemia,id_paziente)values
('2025-03-15', 58, 170, 95, 145, 85, NULL );

delete
from pazienti 
where nome = 'JOJO';

select * from pazienti p join visite v
on p.Id_paziente =v.id_paziente ; 

select p.cognome,p.nome,v.data_visita  from pazienti p join visite v
on p.Id_paziente =v.id_paziente ; 


select p.cognome,p.nome,v.pressione_min,v.pressione_max   from pazienti p join visite v
on p.Id_paziente =v.id_paziente ; 


select p.cognome,p.nome,v.pressione_min,v.pressione_max   from pazienti p join visite v
on p.Id_paziente =v.id_paziente 
where v.pressione_min >80; 

select p.cognome,p.nome,v.pressione_min,v.pressione_max  ,avg(pressione_min) as mediaPressioniMinime from pazienti p join visite v
on p.Id_paziente =v.id_paziente
where cognome like ("Bianchi");

select nome,cognome
from pazienti p
inner join visite v 
on p.Id_paziente= v.id_paziente;-- Inner join ti fa vedere i pazienti che hanno una visita

select nome,cognome, v.data_visita 
from pazienti p
left join visite v    -- il left join ti fa vedere anche i pazienti che non hanno visite (da priorità alla tabella di sinista)
on p.Id_paziente = v.id_paziente;

select nome,cognome, v.data_visita 
from pazienti p
right join visite v    -- il right join ti fa vedere anche le visite che non hanno pazienti (da priorità alla tabella di destra)
on p.Id_paziente = v.id_paziente;

select nome,cognome, v.data_visita 
from pazienti p
full join visite v    -- il full join ti fa vedere anche le visite che non hanno pazienti e date (però MariaDB non lo accetta)
on p.Id_paziente = v.id_paziente;-- per fare il full join puoi fare sia right e left

select nome,cognome, v.data_visita 
from pazienti p
right join visite v    -- il right join ti fa vedere anche le visite che non hanno pazienti (da priorità alla tabella di destra)
on p.Id_paziente = v.id_paziente;

-- FULL JOIN
select nome,cognome, v.data_visita 
from pazienti p
left join visite v    
on p.Id_paziente = v.id_paziente
union
select nome,cognome, v.data_visita 
from pazienti p
right join visite v    
on p.Id_paziente = v.id_paziente;

select count (v.data_visita) as totale_visite
from pazienti p
right join visite v
on p.Id_paziente = v.id_paziente;


select count(data_visita)from visite;

select count(v.data_visita)
from visite v
where (v.id_paziente is null);

select count(v.data_visita)
from pazienti p
right join visite v
on p.Id_paziente = v.id_paziente
where(v.id_paziente is null);

select count(p.Id_paziente )
from pazienti p
left join visite v
on p.Id_paziente = v.id_paziente
where(v.data_visita is null);


drop table visite;

drop table pazienti;
