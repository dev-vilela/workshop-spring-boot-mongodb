# 📦 Workshop Spring Boot com MongoDB

Este projeto é uma API RESTful desenvolvida com **Java**, **Spring Boot** e **MongoDB**, como parte de um estudo prático de Programação Orientada a Objetos, com foco em aplicações reais utilizando banco de dados NoSQL.

---

## 🚀 Tecnologias e ferramentas utilizadas

- ✅ Java 17+
- ✅ Spring Boot 3.x
- ✅ Spring Data MongoDB
- ✅ MongoDB Community Server
- ✅ MongoDB Compass
- ✅ Postman
- ✅ Git & GitHub

---

## 📚 Objetivos do Projeto

- Compreender a diferença entre bancos relacionais e orientados a documentos
- Construir uma API REST completa com Spring Boot
- Implementar CRUD com MongoRepository
- Realizar associações entre documentos com objetos aninhados e referências
- Aplicar boas práticas com DTOs e manipulação de exceções

---

## 🧩 Estrutura do Projeto

src/
├── config # Carga inicial com CommandLineRunner
├── domain # Entidades: User, Post
├── dto # Data Transfer Objects: UserDTO, AuthorDTO, CommentDTO
├── repository # Interfaces de acesso ao banco
├── resources # Endpoints REST (controllers)
├── services # Camada de serviço (lógica de negócio)
├── exceptions # Tratamento de exceções personalizadas


---

## 📬 Principais Endpoints

| Método | Endpoint                  | Descrição                            |
|--------|---------------------------|----------------------------------------|
| GET    | /users                    | Lista todos os usuários               |
| GET    | /users/{id}               | Retorna usuário por ID                |
| POST   | /users                    | Insere um novo usuário                |
| DELETE | /users/{id}               | Deleta um usuário                     |
| PUT    | /users/{id}               | Atualiza um usuário                   |
| GET    | /users/{id}/posts         | Lista posts de um usuário             |
| GET    | /posts/{id}               | Retorna post por ID                   |
| GET    | /posts/titlesearch       | Busca posts pelo título               |
| GET    | /posts/fullsearch        | Busca posts com múltiplos critérios   |

---

## 🧪 Testes

Os testes podem ser realizados via **Postman**, importando os endpoints ou testando diretamente via navegador e terminal (`curl`).

---

## 💡 Extras

- Implementação de comentários em posts
- Relacionamento entre documentos (User → Posts)
- Filtros com `@Query` e métodos personalizados no repositório
- Conversão de dados com `DTOs` para evitar exposição direta de entidades

---

## 📷 Exemplo de Documento

```json
{
  "id": "1001",
  "name": "Paulo Vilela",
  "email": "paulo@gmail.com",
  "posts": [
    {
      "date": "2025-05-25",
      "title": "Viagem Confirmada",
      "body": "Indo para São Paulo!",
      "comments": [
        {
          "text": "Boa viagem!",
          "date": "2025-05-25",
          "author": {
            "id": "2002",
            "name": "Saulo"
          }
        }
      ]
    }
  ]
}

👨‍💻 Autor
Paulo Vilela
Estudante de Engenharia de Software e desenvolvedor em formação
