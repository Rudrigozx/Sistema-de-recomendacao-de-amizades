DROP TABLE IF EXISTS `myTable`;

CREATE TABLE `myTable` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `idade` mediumint default NULL,
  `Sexo` TEXT default NULL,
  `Time` TEXT default NULL,
  `Hobby` TEXT default NULL,
  `generoFilmes` TEXT default NULL,
  `interessesEstudo` TEXT default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Cathleen Diniz",26,"Masculino","Santos","Assistir Filmes/series","Terror","Humanas"),
  ("Byron Chaves",37,"Masculino","Sao Paulo","Ler livros","Cómedia","Exatas"),
  ("Isabelle de Barros",49,"Feminino","Corinthians","Academia","Ação","Biologicas"),
  ("Zeph Gomes",47,"Feminino","Palmeiras","Praticar esportes","Romance","Outras"),
  ("Germane Henrique",25,"Masculino","Flamengo","Jogar Games","Aventura","Humanas"),
  ("Maxwell Firmino",28,"Masculino","Fluminense","Outras","Terror","Exatas"),
  ("Victor Antunes",29,"Feminino","Botafogo","Assistir Filmes/series","Cómedia","Biologicas"),
  ("Bethany Rezende",24,"Feminino","Vasco","Ler livros","Ação","Outras"),
  ("Constance de Morais",40,"Masculino","Gremio","Academia","Romance","Humanas"),
  ("Wynne Correa",27,"Masculino","Internacional","Praticar esportes","Aventura","Exatas");

Select * from `myTable`;