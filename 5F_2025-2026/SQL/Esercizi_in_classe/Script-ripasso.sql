create database if not exists mattia_pavarin_connessioni;

use mattia_pavarin_connessioni;

#Creare un DB con tre tabelle: una per contenere diversi modelli di access-point wi-fi, 
#una per i dati dei produttori di questi dispositi e la terza per lo standard WiFi 
#e le relative bande supportate (immaginare di includere nel database anche prodotti vecchi con standard ormai obsoleti); 
#in base alle proprie conoscenze, ed eventualmente ricercando in rete, creare gli schemi di relazione delle tabelle.
#Sulle tabelle così ottenute eseguire le seguenti operazioni:
 #- CRUD
 #- JOIN (tutti i tipi, coinvolgendo due e tre tabelle)
 #- utilizzo degli operatori aggregati(inclusi group-by e having)

create table access_point (
    id_access_point INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    modello VARCHAR(50),
    indirizzo_mac CHAR(17),
    indirizzo_ip VARCHAR(15),
    posizione VARCHAR(100),
    data_installazione DATE,
    stato VARCHAR(50),
    id_produttore INT,
    id_standard_wifi INT,
    foreign key (id_produttore) references dati_produttori (id_produttore),
    foreign key (id_standard_wifi) references standard_wifi (id_standard_wifi)
);



create table dati_produttori(
    id_produttore INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    paese VARCHAR(50),
    sito_web VARCHAR(100),
    email_supporto VARCHAR(100),
    telefono_supporto VARCHAR(20)
);

create table standard_wifi(
  id_standard_wifi INT PRIMARY KEY AUTO_INCREMENT,
    nome_standard VARCHAR(20),      
    nome_commerciale VARCHAR(20),  
    frequenza VARCHAR(20),          
    velocita_massima_mbps INT,
    anno_introduzione INT
);

INSERT INTO standard_wifi(nome_standard, nome_commerciale, frequenza, velocita_massima_mbps, anno_introduzione) VALUES
('802.11b', 'Wi-Fi 1', '2.4 GHz', 11, 1999),
('802.11g', 'Wi-Fi 3', '2.4 GHz', 54, 2003),
('802.11n', 'Wi-Fi 4', '2.4 / 5 GHz', 600, 2009),
('802.11ac', 'Wi-Fi 5', '5 GHz', 3466, 2014),
('802.11ax', 'Wi-Fi 6', '2.4 / 5 / 6 GHz', 9600, 2019);

INSERT INTO dati_produttori(nome, paese, sito_web, email_supporto, telefono_supporto)VALUES
('TP-Link', 'Cina', 'www.tp-link.com', 'support@tp-link.com', '+86 123456'),
('Cisco', 'USA', 'www.cisco.com', 'support@cisco.com', '+1 555123'),
('Ubiquiti', 'USA', 'www.ui.com', 'support@ui.com', '+1 555999');

INSERT INTO access_point(nome, modello, indirizzo_mac, indirizzo_ip, posizione, data_installazione, stato, id_produttore, id_standard_wifi)VALUES
('AP Aula 1', 'Archer C6', 'AA:BB:CC:DD:EE:01', '192.168.1.10', 'Aula 1', '2022-09-01', 'attivo', 1, 4),
('AP Aula 2', 'Aironet 1830', 'AA:BB:CC:DD:EE:02', '192.168.1.11', 'Aula 2', '2021-03-15', 'attivo', 2, 5),
('AP Magazzino', 'UniFi AP LR', 'AA:BB:CC:DD:EE:03', '192.168.1.12', 'Magazzino', '2018-06-20', 'spento', 3, 3);

select * from access_point;

/*
 * CRUD

Inserisci un nuovo access point indicando modello, produttore, standard Wi-Fi e stato attivo.

Inserisci un nuovo produttore europeo.

Inserisci uno standard Wi-Fi obsoleto (precedente al 2000).

Visualizza tutti gli access point presenti nel database.

Visualizza solo gli access point con stato = "attivo".

Visualizza tutti i produttori ordinati per nome.

Aggiorna lo stato di un access point a manutenzione.

Cambia la posizione di un access point già esistente.

Aggiorna la velocità massima di uno standard Wi-Fi.

Elimina un access point non più utilizzato.

Elimina uno standard Wi-Fi senza access point associati.

🔵 JOIN (2 tabelle)

Visualizza il nome degli access point insieme al nome del produttore.

Visualizza gli access point con il relativo standard Wi-Fi utilizzato.

Visualizza tutti i produttori, anche quelli che non hanno access point.

Visualizza solo i produttori che hanno almeno un access point.

🟣 JOIN (3 tabelle)

Visualizza per ogni access point:

nome access point

produttore

nome commerciale dello standard Wi-Fi

Visualizza solo gli access point che utilizzano uno standard Wi-Fi introdotto dopo il 2010.

Visualizza gli access point installati prima del 2020 con il relativo produttore.

🟠 FUNZIONI AGGREGATE

Conta il numero totale di access point.

Calcola la velocità media degli standard Wi-Fi.

Visualizza il numero di access point per stato.

🔴 GROUP BY / HAVING

Visualizza il numero di access point per produttore.

Visualizza solo i produttori che hanno più di un access point.

Visualizza il numero di access point per standard Wi-Fi.

Visualizza solo gli standard Wi-Fi utilizzati da almeno un access point.
 */
insert into access_point(nome, modello, indirizzo_mac, indirizzo_ip, posizione, data_installazione, stato, id_produttore, id_standard_wifi)VALUES
('AP Aula 3', 'test', 'AA:BB:DD:CC:EE:01', '192.168.123.30', 'Aula 3', '2012-09-25', 'attivo', 1, 4);

INSERT INTO dati_produttori(nome, paese, sito_web, email_supporto, telefono_supporto)VALUES
('AVM', 'Germania', 'www.avm.de', 'support@avm.de', '+49 123456789');

INSERT INTO standard_wifi(nome_standard, nome_commerciale, frequenza, velocita_massima_mbps, anno_introduzione)VALUES
('802.11', 'Wi-Fi 0', '2.4 GHz', 2, 1997);

select * from access_point;

select * from access_point where stato='attivo';

select * from dati_produttori order by nome;

update access_point 
set stato = 'manutenzione' where id_access_point=4;

update access_point 
set posizione = 'Atrio' where id_access_point=2;

select * from standard_wifi;

update standard_wifi
set velocita_massima_mbps= 12 where id_standard_wifi=1;

delete  from access_point
where id_access_point= 1;

delete  from standard_wifi
where id_standard_wifi= 2;

#PARTE 2

select a.nome as nome_access_point,p.nome as nome_produttore
from access_point a 
join dati_produttori p
on a.id_produttore = p.id_produttore ;

select a.nome as nome_access_point, s.nome_commerciale as nome_connessione
from access_point a
join standard_wifi s 
on a.id_standard_wifi = s.id_standard_wifi ;

select a.nome as nome_access_point,p.nome as nome_produttore
from access_point a 
right join dati_produttori p
on a.id_produttore = p.id_produttore ;

select a.nome as nome_access_point,p.nome as nome_produttore
from access_point a 
left join dati_produttori p
on a.id_produttore = p.id_produttore ;


#PARTE 3

#PARTE 4

select count(id_access_point) from access_point;

select avg(velocita_massima_mbps) as media_velocita_media
from standard_wifi;

select  stato,count(id_access_point) from access_point group by stato;

select p.nome as produttore, COUNT(a.id_access_point) as numero_access_point
from dati_produttori p
left join access_point a
on p.id_produttore = a.id_produttore
group by p.nome;

select p.nome as produttore, count(a.id_access_point) as numero_access_point
from dati_produttori p
inner join access_point a
on p.id_produttore = a.id_produttore
group by p.nome
having count(a.id_access_point) > 1;

select s.nome_standard, count(a.id_access_point) as numero_access_point
from standard_wifi s
left join access_point a
on s.id_standard_wifi = a.id_standard_wifi
group by s.nome_standard;


select s.nome_standard, count(a.id_access_point) as numero_access_point
from standard_wifi s
inner join access_point a
on s.id_standard_wifi = a.id_standard_wifi
group by s.nome_standard;



