# Avaliação Prática 1 – Persistência de Dados com Spring Boot

Este projeto foi desenvolvido como parte da disciplina de Arquitetura de Aplicações Web (AAW) e tem como objetivo demonstrar a criação de uma aplicação RESTful utilizando Spring Boot, com foco em operações de persistência de dados.

## 📚 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **Banco de Dados Relacional** (ex: H2, PostgreSQL ou MySQL)
* **Maven**

## 📂 Estrutura do Projeto

O projeto segue a arquitetura padrão do Spring Boot, com os seguintes pacotes principais:

* `model`: Contém as entidades JPA que representam as tabelas do banco de dados.
* `repository`: Interfaces que estendem `JpaRepository` para acesso aos dados.
* `controller`: Controladores REST que expõem os endpoints da API.
* `service`: Camada de serviço contendo a lógica de negócios (se aplicável).


## 🧑‍💻 Autor

* **Gabriel Moreira** – [@gbrlmoreira](https://github.com/gbrlmoreira)
