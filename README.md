
PERSON API REST com Spring Boot  - DIO 

Atividade desenvolvida com a Digital Innovation One no Bootcamp Java Everis 

Desenvolvimento de um sistema simples de gerenciamento de pessoas 
- Operações básicas de cadastro, leitura, atualização e remoção de pessoas 
- Utilização do H2 como Banco de Dados em memória
- Utilização do Heroku para disponibilizar sistema em nuvem
- Utilização Java 11 Zulu e Maven 4.0

Para executar o projeto no terminal, digite o seguinte comando:

mvn spring-boot:run 

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

http://localhost:8080/api/v1/people

ORIENTAÇÕES :

GET - listagem geral : v1/people
GET	- listagem especifica :  v1/people/id
POST -adição de pessoa : v1/people/
PUT	- atualização de pessoa : v1/people/id
DELETE - remoção de pessoa	: v1/people/id
