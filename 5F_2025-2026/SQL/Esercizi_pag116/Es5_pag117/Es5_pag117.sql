create table persone(
nr_tessera int auto_increment primary key,
cf char(16),
cognome varchar(50),
nome varchar(50),
data date,
patologia varchar(20),
esenzione varchar(20),
allergia varchar(20)
);

insert into persone(cf,cognome,nome,data,patologia,esenzione,allergia)
values('PVRMTT07H17H620P','Pavarin','Mattia','2007-06-07','patologia','E41','Polvere'),
('PVRMTT07H17H620P','Pavarin','Mattia','2007-06-07','patologia1','E41','Polvere1'),
('PVRMTT07H17H621P','Pavarin2','Mattis','2008-06-07','patologia2','E42','Polvere2'),
('PVRMTT07H17H622P','Pavarin3','Mattio','2009-06-07','patologia3','E43','Polvere3'),
('PVRMTT07H17H623P','Pavarin4','Matta','2000-06-07','patologia4','E44','Polvere4'),
('PVRMTT07H17H624P','Pavarin5','Matita','2001-06-07','patologia5','E45','Polvere5'),
('PVRMTT07H17H625P','Pavarin6','Mattina','2002-06-07','patologia6','E46','Polvere6'),
('PVRMTT07H17H626P','Pavarin7','Mattias','2003-06-07','patologia7','E48','Polvere7');

delete from persone where esenzione='E48';

update persone 
