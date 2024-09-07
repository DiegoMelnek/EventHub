
# EventHub - API de Gerenciamento de Eventos

EventHub é uma API REST desenvolvida para gerenciar eventos, permitindo que os usuários possam criar, editar, excluir e visualizar eventos, além de se registrar e gerenciar sua participação nos mesmos. Este projeto utiliza Java 17, Spring Boot 3, Spring Data JPA, e outras tecnologias modernas, com o deploy na nuvem feito pela Railway.

## Funcionalidades Principais

- **Cadastro de Eventos**: Permite criar eventos com título, descrição, data, local, capacidade máxima de participantes, e status (ativo/inativo).
- **Gerenciamento de Participantes**: Usuários podem se registrar para eventos, verificando a disponibilidade de vagas.
- **Gerenciamento de Usuários**: Criação de usuários e autenticação, com gerenciamento de suas participações nos eventos.
- **Consulta de Eventos**: Pesquisa de eventos com filtros por data, local, status e capacidade, além de paginação dos resultados.
- **Documentação da API**: Utilização do Swagger para uma documentação robusta e acessível da API.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3**: Framework para desenvolvimento do backend.
- **Spring Data JPA**: Para interação com o banco de dados relacional.
- **H2 Database** (em desenvolvimento) / **PostgreSQL** (no deploy): Banco de dados.
- **Swagger/OpenAPI**: Para documentação da API.
- **Railway**: Para deploy da API na nuvem.
- **Spring Security**: Para autenticação e autorização de usuários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

src
│
├── main
│   ├── java
│   │   └── me
│   │       └── melnek
│   │           └── eventhub
│   │               ├── controllers
│   │               ├── models
│   │               ├── repositories
│   │               ├── services
│   └── resources
│       ├── application.properties
│       └── data.sql
└── test
└── java
└── com
└── eventhub

- `controllers`: Contém os endpoints da API.
- `models`: Modelos de dados para eventos e usuários.
- `repositories`: Interfaces para a persistência de dados usando Spring Data JPA.
- `services`: Lógica de negócios para gerenciamento de eventos e participantes.
- `application.properties`: Configurações da aplicação.
- `data.sql`: Dados iniciais para popular o banco (opcional).

## Instalação e Execução

### Pré-requisitos

- Java 17 instalado.
- Gradle instalado.
- Railway (para deploy na nuvem).

### Passos para rodar a aplicação localmente:

1. Clone o repositório:
   git clone https://github.com/seu-usuario/eventhub.git

2. Navegue até a pasta do projeto:
   cd eventhub

3. Execute o projeto:
   ./gradlew bootRun

4. Acesse a API em http://localhost:8080.

5. Acesse a documentação Swagger em http://localhost:8080/swagger-ui.html.

### Deploy no Railway

1. Faça o deploy utilizando o Railway. Siga as instruções do Railway para conectar o seu repositório e configurar o banco de dados.

## Endpoints da API

### Eventos

- GET /events: Lista todos os eventos (com filtros opcionais).
- POST /events: Cria um novo evento (apenas para usuários autenticados).
- PUT /events/{id}: Edita um evento existente (apenas para usuários autenticados).
- DELETE /events/{id}: Remove um evento (apenas para usuários autenticados).

### Participantes

- POST /events/{id}/register: Registra o usuário no evento.
- DELETE /events/{id}/unregister: Cancela a inscrição do usuário no evento.

### Usuários

- POST /users: Cadastra um novo usuário.
- POST /login: Autenticação do usuário.

## Desafios Extras

- Implementar validações para limitar o número de participantes de um evento.
- Adicionar cache para otimizar as consultas de eventos.
- Enviar notificações por e-mail para participantes em caso de atualizações ou cancelamentos de eventos.

## Contribuição

Se você deseja contribuir para este projeto, siga os passos abaixo:

1. Fork o repositório.
2. Crie uma nova branch com suas modificações (git checkout -b feature/nova-funcionalidade).
3. Commit suas mudanças (git commit -m 'Adiciona nova funcionalidade').
4. Push para o repositório (git push origin feature/nova-funcionalidade).
5. Crie um Pull Request.

## Licença

Distribuído sob a licença MIT. Veja LICENSE para mais informações.
