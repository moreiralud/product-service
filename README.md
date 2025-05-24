===============================
PRODUCT-SERVICE - TECH CHALLENGE
===============================

Microsserviço responsável pelo gerenciamento de produtos no sistema de pedidos distribuído do Tech Challenge.

-------------------------------
📦 TECNOLOGIAS UTILIZADAS
-------------------------------
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- Lombok

-------------------------------
📁 ESTRUTURA DO PROJETO
-------------------------------
src/
├── main/
│   ├── java/
│   │   └── br.com.techchallenge.product/
│   │       ├── application/    -> Controllers (API REST)
│   │       ├── core/           -> Domínio, entidades e interfaces
│   │       └── infrastructure/ -> Repositórios e configuração
│   └── resources/
│       ├── application.yml     -> Configurações do serviço
│       └── ...                 -> Outros recursos
└── test/                       -> Testes unitários e de integração

-------------------------------
⚙️ COMO EXECUTAR LOCALMENTE
-------------------------------
1. Verifique se o Docker está instalado e em execução.
2. Execute o comando:
   docker compose up --build

O serviço estará disponível em: http://localhost:8081

-------------------------------
🔁 ENDPOINTS PRINCIPAIS
-------------------------------
GET     /produtos           - Lista todos os produtos
POST    /produtos           - Cadastra um novo produto
GET     /produtos/{id}      - Detalha um produto específico
PUT     /produtos/{id}      - Atualiza as informações de um produto
DELETE  /produtos/{id}      - Remove um produto

-------------------------------
✅ TESTES
-------------------------------
Os testes estão localizados em `src/test`.

Para executar:
> mvn test

Para gerar o relatório de cobertura:
> mvn jacoco:report

Acesse o relatório em:
target/site/jacoco/index.html

-------------------------------
📌 OBSERVAÇÕES
-------------------------------
- Este serviço integra o ecossistema de microsserviços do sistema de pedidos.
- Pode depender de serviços externos via HTTP.
- Banco de dados PostgreSQL configurável via `application.yml`.

-------------------------------
👩‍💻 DESENVOLVIDO POR
-------------------------------
Ludmila Moreira - Tech Challenge 2025

