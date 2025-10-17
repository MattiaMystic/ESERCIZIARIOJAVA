SELECT * FROM Studenti;
SELECT nome,cognome FROM Studenti;
SELECT * FROM Studenti where voto >27;
SELECT * FROM Studenti where voto between 23 and 29;
SELECT * FROM Studenti where voto>= 23 and voto<=29;
SELECT * FROM Studenti where voto<=20 or voto>=27;
SELECT * FROM Studenti where corso in ('Informatica','Sistemi');
SELECT * FROM Studenti where corso like 'Informatica';
SELECT * FROM Studenti where corso like 'I%';
