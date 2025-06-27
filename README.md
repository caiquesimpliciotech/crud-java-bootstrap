# CRUD de Usuários com Java Spring Boot e Bootstrap

Este é um projeto simples de CRUD (Create, Read, Update, Delete) para gerenciamento de usuários, desenvolvido com:

- Java 17 e Spring Boot
- Thymeleaf para templates HTML
- Bootstrap 5 para estilo visual responsivo
- Banco de dados H2 (embutido para testes)
- Maven para gerenciamento do projeto

## Funcionalidades

- Listar usuários
- Criar novo usuário
- Editar usuário existente
- Excluir usuário

## Estrutura do Projeto

- `model/` — Classe User (dados do usuário)
- `repository/` — Interface UserRepository para acesso ao banco
- `service/` — Classe UserService com regras de negócio
- `controller/` — Controlador para rotas web e manipulação de dados
- `templates/` — Arquivos HTML com Thymeleaf e Bootstrap
- `static/` — Arquivos estáticos (CSS, JS, imagens)
- `pom.xml` — Configurações do Maven e dependências

## Como rodar localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuUsuario/seuRepositorio.git
   cd seuRepositorio
