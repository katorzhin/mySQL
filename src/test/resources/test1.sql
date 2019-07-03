select * from saleoeople;
insert into saleoeople(Snum,Sname,CITY,COMM)values(1004,'Axelrod','New York',.10);
#delete from saleoeople where Snum=1001;
update saleoeople set Sname='Peel' where Snum=1001;
select Sname,COMM from saleoeople;