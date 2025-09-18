create database	if not exists Loja;
use Loja;

create table Clientes(
	id int auto_increment primary key,
    nome varchar(50),
    email varchar(50),
    cidade varchar(50)
);

insert into Clientes (nome, email, cidade) values ("Ana Silva","ana@gmail.com","São Paulo"),
												  ("Carlos Souza","carlos@gmail.com","Campinas"),
												  ("Joana Lima","joana@gmail.com","Floripa"),
                                                  ("José Mauro","jose@gmail.com","BC");
                                                  
alter table Clientes
add telefone varchar(20);

alter table Clientes
modify cidade varchar(100);

alter table Clientes
rename column email to email_contato;

alter table Clientes
drop column telefone;

select * from Clientes;