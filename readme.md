# SorteAppWeb

SorteAppWeb é uma aplicação web Java para gerenciar sorteios. A aplicação permite criar, ler, atualizar e deletar sorteios, além de selecionar um ganhador para cada sorteio. Este projeto foi desenvolvido como um projeto acadêmico durante meus estudos na faculdade.

## Tecnologias utilizadas

- Java
- Servlets
- JSP
- JDBC
- MySQL

## Banco de Dados

O projeto utiliza um banco de dados MySQL para armazenar os dados dos sorteios. A conexão com o banco de dados é feita através do JDBC. O banco de dados contém uma tabela chamada `sorteios`, que armazena informações como nome do sorteio, descrição, datas de início e fim, prêmio, quantidade de cotas e o ganhador.

## Aprendizado

Durante o desenvolvimento deste projeto, aprendi várias coisas importantes:

- Como criar uma aplicação web em Java usando Servlets e JSP.
- Como conectar uma aplicação Java a um banco de dados MySQL usando JDBC.
- Como realizar operações CRUD (Criar, Ler, Atualizar, Deletar) em um banco de dados.
- Como gerenciar o fluxo de dados entre diferentes partes da aplicação.
- Como lidar com erros e exceções em uma aplicação Java.

## Funcionalidades

- **Inserir Sorteio:** Permite ao usuário criar um novo sorteio com nome, descrição e datas de início e fim.
- **Listar Sorteios:** Exibe uma lista de todos os sorteios criados.
- **Selecionar Sorteio:** Permite ao usuário selecionar um sorteio específico para visualizar ou editar detalhes.
- **Editar Sorteio:** Permite ao usuário editar os detalhes de um sorteio existente.
- **Deletar Sorteio:** Permite ao usuário remover um sorteio existente.
- **Informar Ganhador:** Permite ao usuário informar o ganhador de um sorteio.

## Como executar

1. Clone o repositório para sua máquina local.
2. Importe o projeto para o seu IDE preferido.
3. Configure o servidor de aplicação (Tomcat, Jetty, etc.).
4. Execute o projeto.

## Contribuições

Contribuições são sempre bem-vindas. Sinta-se à vontade para abrir uma issue ou enviar um pull request.
