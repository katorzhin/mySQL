select * from saleoeople;
insert into saleoeople(Snum,Sname,CITY,COMM)values(1001,'Pe','London',1.12);
SELECT Sname,CITY from saleoeople;
insert into customers(CNUM, CNAME, CITY, RATING, SNUM)values(2007,'Pereira','Rome',100,1004);
select *from customers;
insert into orders(ONUM, AMT, ODATE, CNUM, SNUM)values(3011 ,9891.88 ,10/06/1990, 2006 ,1001);
select *from orders;

select *from customers;
select *from orders where ODATE=10/03/1990;
select *from customers where SNUM in (1001,1007,1004);
select *from customers where CNAME between 'A' and 'Gz';
select *from saleoeople where Sname like 'P%l';
select *from saleoeople where Sname like '%/_%' ESCAPE '/';
insert into saleoeople(Snum, Sname, CITY, COMM) VALUE (11,'ol_as','a_x',56.23);
select *from saleoeople;
select *from orders where ODATE in (10/04/1990,10/03/1990);
select *from customers where CNAME like 'C%';
select *from orders where AMT in (null,0) ;