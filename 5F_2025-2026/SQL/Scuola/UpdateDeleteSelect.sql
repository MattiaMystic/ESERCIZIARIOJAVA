delete from Studenti where studenti=1; 
delete from Studenti where cognome ='Belgio' and nome='Rossi';
-- DROP ellimina la tabella intera 
truncate table Studenti;
-- truncate ellimina i dati ma non la struttura 
-- CON DROP POSSO CANCELLARE LE COLONNE 
update Studenti set voto = 8 where studenti=1;

update Studenti set nome='Orazio' where studenti=1;

update Studenti set nome='Gino' where nome='Beppe';

select * from Studenti;
