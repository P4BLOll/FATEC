CREATE TABLE `Aluno` (
  `id_aluno` integer PRIMARY KEY AUTO_INCREMENT,
  `nome_completo` varchar(255),
  `email_inst` varchar(255)
);

CREATE TABLE `Curso` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `nome_curso` varchar(255),
  `numero_semes` int
);

CREATE TABLE `Matricula` (
  `id_matricula` integer PRIMARY KEY AUTO_INCREMENT,
  `id_curso` integer,
  `nuemro_matricula` interger,
  `data_ingresso` date,
  `situacao` varchar(255)
);

ALTER TABLE `Matricula` ADD FOREIGN KEY (`id_curso`) REFERENCES `Curso` (`id`);

ALTER TABLE `Matricula` ADD FOREIGN KEY (`nuemro_matricula`) REFERENCES `Aluno` (`id_aluno`);
