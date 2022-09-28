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
  ("Jeremy Matias",54,"Masculino","Santos","Assistir Filmes/series","Terror","Humanas"),
  ("Winifred da Rocha",47,"Masculino","Sao Paulo","Ler livros","Cómedia","Exatas"),
  ("Xander da Silveira",35,"Feminino","Corinthians","Academia","Ação","Biologicas"),
  ("Armando Simoes",58,"Feminino","Palmeiras","Praticar esportes","Romance","Outras"),
  ("Slade Pinheiro",27,"Masculino","Flamengo","Jogar Games","Aventura","Humanas"),
  ("Nigel Messias",44,"Masculino","Fluminense","Outras","Terror","Exatas"),
  ("Cora Vieira",19,"Feminino","Botafogo","Assistir Filmes/series","Cómedia","Biologicas"),
  ("Orlando Oliveira",57,"Feminino","Vasco","Ler livros","Ação","Outras"),
  ("Solomon Macedo",37,"Masculino","Gremio","Academia","Romance","Humanas"),
  ("Oren Braga",34,"Masculino","Internacional","Praticar esportes","Aventura","Exatas");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Meredith Chaves",40,"Feminino","Cruzeiro","Jogar Games","Terror","Biologicas"),
  ("Jordan Santana",25,"Feminino","Atletico Mineiro","Outras","Cómedia","Outras"),
  ("Amber Sántos",56,"Masculino","Santos","Assistir Filmes/series","Ação","Humanas"),
  ("Kellie de Moura",37,"Masculino","Sao Paulo","Ler livros","Romance","Exatas"),
  ("Mercedes Lopes",55,"Feminino","Corinthians","Academia","Aventura","Biologicas"),
  ("Eric Carvalho",49,"Feminino","Palmeiras","Praticar esportes","Terror","Outras"),
  ("Noelle Galdino",24,"Masculino","Flamengo","Jogar Games","Cómedia","Humanas"),
  ("Ulla da Cruz",26,"Masculino","Fluminense","Outras","Ação","Exatas"),
  ("Hop Leal",53,"Feminino","Botafogo","Assistir Filmes/series","Romance","Biologicas"),
  ("Blaze Lima",28,"Feminino","Vasco","Ler livros","Aventura","Outras");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Latifah de Melo",21,"Masculino","Gremio","Academia","Terror","Humanas"),
  ("Elvis de Lourdes",53,"Masculino","Internacional","Praticar esportes","Cómedia","Exatas"),
  ("Quinn Torres",39,"Feminino","Cruzeiro","Jogar Games","Ação","Biologicas"),
  ("Selma Bueno",47,"Feminino","Atletico Mineiro","Outras","Romance","Outras"),
  ("Merrill de Jesus",21,"Masculino","Santos","Assistir Filmes/series","Aventura","Humanas"),
  ("Beau Melo",22,"Masculino","Sao Paulo","Ler livros","Terror","Exatas"),
  ("Rhea da Costa",22,"Feminino","Corinthians","Academia","Cómedia","Biologicas"),
  ("Kuame Miranda",18,"Feminino","Palmeiras","Praticar esportes","Ação","Outras"),
  ("Angelica Magalhaes",45,"Masculino","Flamengo","Jogar Games","Romance","Humanas"),
  ("Cullen Coutinho",57,"Masculino","Fluminense","Outras","Aventura","Exatas");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Skyler da Conceiçao",30,"Feminino","Botafogo","Assistir Filmes/series","Terror","Biologicas"),
  ("Halee de Freitas",42,"Feminino","Vasco","Ler livros","Cómedia","Outras"),
  ("Cyrus Muniz",57,"Masculino","Gremio","Academia","Ação","Humanas"),
  ("Lucian de Azevedo",49,"Masculino","Internacional","Praticar esportes","Romance","Exatas"),
  ("Chadwick de Abreu",51,"Feminino","Cruzeiro","Jogar Games","Aventura","Biologicas"),
  ("Ina Bueno",51,"Feminino","Atletico Mineiro","Outras","Terror","Outras"),
  ("Burke de Carvalho",48,"Masculino","Santos","Assistir Filmes/series","Cómedia","Humanas"),
  ("Rogan Sampaio",43,"Masculino","Sao Paulo","Ler livros","Ação","Exatas"),
  ("Brenna de Freitas",42,"Feminino","Corinthians","Academia","Romance","Biologicas"),
  ("Wanda Siqueira",22,"Feminino","Palmeiras","Praticar esportes","Aventura","Outras");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Gregory Rocha",32,"Masculino","Flamengo","Jogar Games","Terror","Humanas"),
  ("Germane Felix",26,"Masculino","Fluminense","Outras","Cómedia","Exatas"),
  ("Kelly Ferraz",40,"Feminino","Botafogo","Assistir Filmes/series","Ação","Biologicas"),
  ("Avye de Paula",57,"Feminino","Vasco","Ler livros","Romance","Outras"),
  ("Elijah Pinto",58,"Masculino","Gremio","Academia","Aventura","Humanas"),
  ("Ali Freitas",57,"Masculino","Internacional","Praticar esportes","Terror","Exatas"),
  ("Moses dos Reis",25,"Feminino","Cruzeiro","Jogar Games","Cómedia","Biologicas"),
  ("Scott Pinheiro",36,"Feminino","Atletico Mineiro","Outras","Ação","Outras"),
  ("Mari Braga",56,"Masculino","Santos","Assistir Filmes/series","Romance","Humanas"),
  ("Aladdin Freitas",33,"Masculino","Sao Paulo","Ler livros","Aventura","Exatas");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Anika de Abreu",53,"Feminino","Corinthians","Academia","Terror","Biologicas"),
  ("Maris Diniz",31,"Feminino","Palmeiras","Praticar esportes","Cómedia","Outras"),
  ("Abraham Leal",49,"Masculino","Flamengo","Jogar Games","Ação","Humanas"),
  ("Cathleen Muniz",36,"Masculino","Fluminense","Outras","Romance","Exatas"),
  ("Kessie Santos",48,"Feminino","Botafogo","Assistir Filmes/series","Aventura","Biologicas"),
  ("Yvonne da Cruz",58,"Feminino","Vasco","Ler livros","Terror","Outras"),
  ("April Amorim",20,"Masculino","Gremio","Academia","Cómedia","Humanas"),
  ("Leandra Magalhaes",57,"Masculino","Internacional","Praticar esportes","Ação","Exatas"),
  ("Xanthus Santiago",46,"Feminino","Cruzeiro","Jogar Games","Romance","Biologicas"),
  ("Yvette Gomes",33,"Feminino","Atletico Mineiro","Outras","Aventura","Outras");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Kareem Messias",41,"Masculino","Santos","Assistir Filmes/series","Terror","Humanas"),
  ("Sacha da Conceiçao",53,"Masculino","Sao Paulo","Ler livros","Cómedia","Exatas"),
  ("Maggie Fonseca",51,"Feminino","Corinthians","Academia","Ação","Biologicas"),
  ("Jerry Machado",28,"Feminino","Palmeiras","Praticar esportes","Romance","Outras"),
  ("Dai Costa",24,"Masculino","Flamengo","Jogar Games","Aventura","Humanas"),
  ("Byron Braga",51,"Masculino","Fluminense","Outras","Terror","Exatas"),
  ("Ciaran Melo",43,"Feminino","Botafogo","Assistir Filmes/series","Cómedia","Biologicas"),
  ("Nicholas Abreu",20,"Feminino","Vasco","Ler livros","Ação","Outras"),
  ("Buckminster Das Neves",43,"Masculino","Gremio","Academia","Romance","Humanas"),
  ("Rowan Macedo",20,"Masculino","Internacional","Praticar esportes","Aventura","Exatas");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Whitney Morais",46,"Feminino","Cruzeiro","Jogar Games","Terror","Biologicas"),
  ("Hope Coelho",28,"Feminino","Atletico Mineiro","Outras","Cómedia","Outras"),
  ("Gay Carneiro",37,"Masculino","Santos","Assistir Filmes/series","Ação","Humanas"),
  ("Yael Teixeira",55,"Masculino","Sao Paulo","Ler livros","Romance","Exatas"),
  ("James dos Anjos",22,"Feminino","Corinthians","Academia","Aventura","Biologicas"),
  ("Glenna da Cruz",49,"Feminino","Palmeiras","Praticar esportes","Terror","Outras"),
  ("Teegan Gonzaga",26,"Masculino","Flamengo","Jogar Games","Cómedia","Humanas"),
  ("Willow Candido",59,"Masculino","Fluminense","Outras","Ação","Exatas"),
  ("Nyssa Diniz",24,"Feminino","Botafogo","Assistir Filmes/series","Romance","Biologicas"),
  ("Raya Neves",43,"Feminino","Vasco","Ler livros","Aventura","Outras");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Ariana Duarte",23,"Masculino","Gremio","Academia","Terror","Humanas"),
  ("Simon do Carmo",30,"Masculino","Internacional","Praticar esportes","Cómedia","Exatas"),
  ("Desiree dos Santos",47,"Feminino","Cruzeiro","Jogar Games","Ação","Biologicas"),
  ("Knox Mota",47,"Feminino","Atletico Mineiro","Outras","Romance","Outras"),
  ("Irene Barreto",45,"Masculino","Santos","Assistir Filmes/series","Aventura","Humanas"),
  ("Ora de Brito",56,"Masculino","Sao Paulo","Ler livros","Terror","Exatas"),
  ("Joan Xavier",21,"Feminino","Corinthians","Academia","Cómedia","Biologicas"),
  ("Evangeline Mariano",54,"Feminino","Palmeiras","Praticar esportes","Ação","Outras"),
  ("Desiree de Barros",36,"Masculino","Flamengo","Jogar Games","Romance","Humanas"),
  ("Vivien Braz",33,"Masculino","Fluminense","Outras","Aventura","Exatas");
INSERT INTO `myTable` (`name`,`idade`,`Sexo`,`Time`,`Hobby`,`generoFilmes`,`interessesEstudo`)
VALUES
  ("Madeline Dutra",40,"Feminino","Botafogo","Assistir Filmes/series","Terror","Biologicas"),
  ("Thaddeus Moraes",57,"Feminino","Vasco","Ler livros","Cómedia","Outras"),
  ("Chelsea Fernandes",28,"Masculino","Gremio","Academia","Ação","Humanas"),
  ("Cara Franco",59,"Masculino","Internacional","Praticar esportes","Romance","Exatas"),
  ("Gabriel Souza",35,"Feminino","Cruzeiro","Jogar Games","Aventura","Biologicas"),
  ("Danielle Moraes",44,"Feminino","Atletico Mineiro","Outras","Terror","Outras"),
  ("Porter Amorim",34,"Masculino","Santos","Assistir Filmes/series","Cómedia","Humanas"),
  ("Kessie do Carmo",50,"Masculino","Sao Paulo","Ler livros","Ação","Exatas"),
  ("Blossom Brandao",24,"Feminino","Corinthians","Academia","Romance","Biologicas"),
  ("Cody Garcia",34,"Feminino","Palmeiras","Praticar esportes","Aventura","Outras");
  
  select * from `myTable`
