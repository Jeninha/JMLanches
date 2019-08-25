create database jmlacnhes;
use jmlanches;

create table usuarios
(
	email varchar(50) primary key,
    senha varchar(100) primary key,
    nome varchar(40) not null,
    fone int,
    data_nasc int not null
);

create table lanches
(
	id_lanche int primary key,
    nome varchar(30) not null,
    preço int not null,
    descricao varchar(200) not null
);

create table pedidos
(
	id_pedidos int primary key,
	pagamento int not null, 
    nome varchar(40) not null references usuarios(nome),
    preço int not null references lanches(preço)
);