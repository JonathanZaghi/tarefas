drop schema if exists paises;
create schema if not exists paises;
use paises;

create table if not exists paises(
id				int primary key not null auto_increment,
nome 			varchar(45) not null,
populacao        bigint(100) not null,
area				double(15,2) NOT NULL
);

insert into paises values (1,'hanamura',656565,15151);