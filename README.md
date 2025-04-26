# 📚 Arquitetura de Aplicações Web – Projetos

Repositório com os projetos desenvolvidos ao longo da disciplina **Arquitetura de Aplicações Web**. Cada pasta representa uma prática diferente com foco em **APIs REST**, **persistência de dados**, **modelo MVC** e **boas práticas no backend** utilizando **Spring Boot**.

---

## 🧱 Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Spring Data MongoDB  
- Lombok  
- MariaDB (via XAMPP)  
- H2 Database  
- MongoDB  
- Maven  
- Postman / Insomnia

---

## 📂 Projetos incluídos

### ✅ `doisApis`
API com dois módulos:  
- Uma API CRUD local  
- Uma API consumidora de dados externos (tabela FIP)  
Utiliza MariaDB e organização em camadas (Model, Repository, Service, Controller).

### ✅ `gerenciamento-tarefas-mvc`
Aplicação de gerenciamento de tarefas com CRUD completo.  
Persistência em **MariaDB**, **H2** e **MongoDB**, com arquitetura baseada em **MVC**.

### ✅ `avaliacao-final-relacionamento`
Projeto de avaliação final: aplicação Spring Boot que gerencia o relacionamento entre duas entidades personalizadas (ex.: Produto e Categoria), com persistência de dados em **MariaDB**.

---

## ⚙️ Como executar os projetos

Cada projeto possui seu próprio `README.md` com instruções detalhadas.  
Em geral, para rodar:

1. Configure o banco (MariaDB ou MongoDB)
2. Ajuste as credenciais no `application.properties`
3. Execute a classe principal no IntelliJ
4. Teste os endpoints com Postman

---

## 📌 Organização

Todos os projetos seguem o padrão MVC, com separação clara de camadas:

- `model/`: entidades do domínio  
- `repository/`: interface com o banco  
- `service/`: regras de negócio  
- `controller/`: endpoints REST

---

## 👨‍💻 Autor

Aluno: *Seu Nome Aqui*  
Disciplina: Arquitetura de Aplicações Web  
Professor: *Nome do Professor (opcional)*  
Curso: *Nome do curso ou instituição (opcional)*

