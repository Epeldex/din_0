drop database if exists helloworld;
create database if not exists helloworld;
use helloworld;

create table greeting (
	hello varchar(20),
    primary key(hello)
);

insert into greeting(hello) values("Hello World!");

SELECT * from greeting