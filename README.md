# Desafio Técnico: CRUD de Carrinho de Compras e Itens

## Descrição do Desafio

O objetivo deste desafio é implementar uma aplicação utilizando **Java 17** e **Spring Framework** para gerenciar um sistema básico de carrinho de compras e itens no carrinho. O candidato deverá criar um CRUD completo para **carrinhos** e **itens no carrinho**, seguindo o padrão arquitetural **Controller-Service-Repository**. Além disso, deve-se utilizar **Lombok**, **JPA**, **Swagger** e aplicar validações personalizadas.

A tabela de **produtos** será usada apenas como referência para injeção de dados na resposta do **DTO** dos itens, simulando o comportamento esperado para o retorno ao frontend.

---

## Requisitos Técnicos

### 1. Stack Tecnológica

- **Java 17**
- **Spring Boot** com as seguintes dependências:
  - Spring Web
  - Spring Data JPA
  - H2 Database (ou outro banco de dados relacional simples)
  - Lombok
  - Spring Validation
  - Swagger/OpenAPI

### 2. Requisitos Funcionais

#### CRUD para **Carrinho**:
- **POST** `/carrinhos`: Criar um novo carrinho.
- **PUT** `/carrinhos/{id}`: Editar os dados de um carrinho existente.
- **GET** `/carrinhos`: Listar todos os carrinhos.
- **GET** `/carrinhos/{id}`: Visualizar um carrinho por ID.
- **DELETE** `/carrinhos/{id}`: Soft delete de um carrinho (alterando o status para "inativo").

#### CRUD para **Itens no Carrinho**:
- **POST** `/carrinhos/{id}/itens`: Adicionar um item a um carrinho.
- **PUT** `/carrinhos/{carrinhoId}/itens/{itemId}`: Editar um item no carrinho.
- **GET** `/carrinhos/{id}/itens`: Listar todos os itens de um carrinho.
- **GET** `/carrinhos/{carrinhoId}/itens/{itemId}`: Visualizar um item no carrinho por ID.
- **DELETE** `/carrinhos/{carrinhoId}/itens/{itemId}`: Remover um item de um carrinho (soft delete, alterando o status do item para "removido").

### 3. Validações

- Um carrinho só pode ter itens com produtos válidos (verificados pela tabela de produtos).
- A quantidade de itens no carrinho não pode ser negativa.
- O status do carrinho deve ser "ativo" ou "inativo", utilizando Enums.

### 4. Documentação

- Utilize **Swagger/OpenAPI** para documentar todas as rotas da aplicação.

### 5. Estrutura do Projeto

- **Entidades**: Carrinho, ItemCarrinho.
- **DTOs**: CarrinhoDTO, ItemCarrinhoDTO.
- **Forms**: Para receber dados de criação/edição.
- **Camadas**: Controller, Service, Validator, Repository.

---

## Modelo de Dados

### Tabela: `carrinhos`

| **Coluna**      | **Tipo**      | **Not Null** | **Descrição**                                |
|-----------------|---------------|--------------|----------------------------------------------|
| `id`            | BIGINT        | SIM          | ID único do carrinho.                        |
| `cliente_nome`  | VARCHAR(100)  | SIM          | Nome do cliente.                             |
| `status`        | VARCHAR(20)   | SIM          | Status do carrinho (ativo/inativo).          |
| `criado_em`     | TIMESTAMP     | SIM          | Data e hora de criação.                      |
| `atualizado_em` | TIMESTAMP     | SIM          | Data e hora de atualização.                  |

### Tabela: `itens_carrinho`

| **Coluna**      | **Tipo**      | **Not Null** | **Descrição**                                |
|-----------------|---------------|--------------|----------------------------------------------|
| `id`            | BIGINT        | SIM          | ID único do item.                            |
| `carrinho_id`   | BIGINT        | SIM          | ID do carrinho ao qual o item pertence.      |
| `produto_id`    | BIGINT        | SIM          | ID do produto associado.                     |
| `quantidade`    | INT           | SIM          | Quantidade do produto no carrinho.           |
| `status`        | VARCHAR(20)   | SIM          | Status do item (ativo/removido).             |
| `criado_em`     | TIMESTAMP     | SIM          | Data e hora de criação do item.              |
| `atualizado_em` | TIMESTAMP     | SIM          | Data e hora de atualização do item.          |

### Tabela: `produtos`

| **Coluna**      | **Tipo**      | **Not Null** | **Descrição**                                |
|-----------------|---------------|--------------|----------------------------------------------|
| `id`            | BIGINT        | SIM          | ID único do produto.                         |
| `nome`          | VARCHAR(100)  | SIM          | Nome do produto.                             |
| `descricao`     | VARCHAR(255)  | NÃO          | Descrição do produto.                        |
| `preco`         | DECIMAL(10,2) | SIM          | Preço do produto.                            |

---

## Orientações Gerais

### 1. Organização de Código

- Separe os pacotes para cada camada (controller, service, repository, model, dto, form, validator).
- Utilize boas práticas, como injeção de dependência e princípios SOLID.

### 2. Documentação do Código

- Adicione comentários onde necessário para explicar lógicas ou decisões importantes.

### 3. Entrega

- Forneça o projeto em um repositório Git público ou envie um arquivo .zip contendo o código e o .jar do projeto.

### 4. Diferenciais

- Implementação de testes unitários para as validações.
- Configuração adequada para rodar a aplicação localmente.

---

**Boa sorte!**
