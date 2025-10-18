delete from MOCK_DATA where id=1000;
select * from MOCK_DATA where id>995;

select * from MOCK_DATA 
order by last_name asc;

select * from MOCK_DATA 
order by last_name desc;

select email as posta from MOCK_DATA  where first_name ='Nero'

select distinct first_name from MOCK_DATA;
-- MI fa vedere solo studenti con nome diverso con distinct 

select distinct first_name from MOCK_DATA limit 10; -- Massimo 10 dati ti farà vedere 
