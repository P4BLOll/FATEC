create database LivrariaDB;
use LivrariaDB;

create table Autores(
	autorID int primary key auto_increment,
    nome varchar(100) not null,
    nacionalidade varchar(50)
);

create table Livros(
	livroID int primary key auto_increment,
    titulo varchar(150) not null,
    anoPublicacao int,
    preco decimal(8, 2),
    autorID int,
    
    foreign key (autorID) references Autores(autorID)
);

create table Vendas(
	vendaID int primary key auto_increment,
    livroID int,
    dataVenda date,
    quantidade int,
    
    foreign key (livroID) references Livros(livroID)
);

-- Autores
INSERT INTO Autores (Nome, Nacionalidade) VALUES
('J.K. Rowling', 'Britânica'), ('George R.R. Martin', 'Americano'), ('Machado de Assis', 'Brasileiro'),
('Stephen King', 'Americano'), ('Agatha Christie', 'Britânica'), ('Paulo Coelho', 'Brasileiro'),
('J. R. R. Tolkien', 'Britânico'), ('Dan Brown', 'Americano'), ('Clarice Lispector', 'Brasileira'),
('Neil Gaiman', 'Britânico'), ('Isabel Allende', 'Chilena'), ('Haruki Murakami', 'Japonês'),
('Cecelia Ahern', 'Irlandesa'), ('Suzanne Collins', 'Americana'), ('Rick Riordan', 'Americano');

-- Livros
INSERT INTO Livros (Titulo, AnoPublicacao, Preco, AutorID) VALUES
('Harry Potter e a Pedra Filosofal', 1997, 59.90, 1), ('Harry Potter e a Câmara Secreta', 1998, 62.50, 1),
('A Game of Thrones', 1996, 70.00, 2), ('Dom Casmurro', 1899, 29.99, 3), ('It', 1986, 45.00, 4),
('Assassinato no Expresso Oriente', 1934, 39.90, 5), ('O Alquimista', 1988, 31.50, 6),
('O Senhor dos Anéis', 1954, 85.00, 7), ('O Código Da Vinci', 2003, 54.90, 8),
('A Hora da Estrela', 1977, 27.00, 9), ('Deuses Americanos', 2001, 42.00, 10),
('A Casa dos Espíritos', 1982, 47.80, 11), ('Kafka à Beira-Mar', 2002, 53.50, 12),
('P.S. I Love You', 2004, 37.00, 13), ('Jogos Vorazes', 2008, 46.00, 14);

-- Vendas
INSERT INTO Vendas (LivroID, DataVenda, Quantidade) VALUES
(1, '2025-05-01', 3), (2, '2025-05-03', 2), (3, '2025-05-02', 1), (4, '2025-05-01', 4),
(5, '2025-05-04', 2), (6, '2025-05-04', 5), (7, '2025-05-05', 2), (8, '2025-05-06', 3),
(9, '2025-05-07', 2), (10, '2025-05-08', 3), (11, '2025-05-09', 1), (12, '2025-05-10', 4),
(13, '2025-05-11', 2), (14, '2025-05-11', 5), (15, '2025-05-12', 3);


-- Média (AVG)
SELECT AVG(Preco) AS MediaPreco FROM Livros;

-- EXEMPLO USANDO ROUND()
SELECT ROUND(AVG(Preco), 2) AS MediaPrecoFormatada FROM Livros;

-- Contagem (COUNT)
SELECT COUNT(*) AS TotalVendas FROM Vendas;

-- Soma (SUM)
SELECT SUM(Quantidade) AS TotalLivrosVendidos FROM Vendas;

-- Maior preço (MAX)
SELECT MAX(Preco) AS MaiorPreco FROM Livros;

-- Valores distintos (DISTINCT)
SELECT DISTINCT Nacionalidade FROM Autores;

-- LIKE
SELECT * FROM Livros WHERE Titulo LIKE 'O%';

-- BETWEEN
SELECT * FROM Vendas WHERE DataVenda BETWEEN '2025-05-03' AND '2025-05-08';

-- EXISTS
SELECT Titulo FROM Livros l WHERE EXISTS (
    SELECT 1 FROM Vendas v WHERE v.LivroID = l.LivroID
);


-- Subconsulta
SELECT Nome
FROM Autores
WHERE AutorID IN (
    SELECT AutorID FROM Livros WHERE Preco > (SELECT AVG(Preco) FROM Livros)
);


-- Case
SELECT Titulo, Preco,
    CASE
        WHEN Preco < 30 THEN 'Barato'
        WHEN Preco BETWEEN 30 AND 60 THEN 'Médio'
        ELSE 'Caro'
    END AS FaixaPreco
FROM Livros;

-- Concat
SELECT CONCAT(l.Titulo, ' - ', a.Nome) AS Livro_Autor
FROM Livros l
JOIN Autores a ON l.AutorID = a.AutorID;


-- View
CREATE VIEW vw_VendasDetalhadas AS
SELECT v.VendaID, l.Titulo, a.Nome AS Autor, v.DataVenda, v.Quantidade
FROM Vendas v
JOIN Livros l ON v.LivroID = l.LivroID
JOIN Autores a ON l.AutorID = a.AutorID;

select * from vw_VendasDetalhadas;
