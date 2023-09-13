create database loja
go

use loja

create table produto (
	id int primary key identity(1,1),
	nome varchar(20) not null,
	preco decimal(5,2) not null,
)

insert into produto values ('Biscoito', 3.99),('Banana', 10.99),('Carne Bovina', 39.98)

SELECT * FROM produto;