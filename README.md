![](https://private-user-images.githubusercontent.com/89420889/320213027-56d76f0b-031a-490d-b787-9f3dbc83789c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzMDk1NDYsIm5iZiI6MTcxMzMwOTI0NiwicGF0aCI6Ii84OTQyMDg4OS8zMjAyMTMwMjctNTZkNzZmMGItMDMxYS00OTBkLWI3ODctOWYzZGJjODM3ODljLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTYlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE2VDIzMTQwNlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWY3MTExOGJiOTI0YTZkYWFkNjVhZmM2MjE5YWI3NzMyYjc5MDI3YTlhMzQ4MDEwOTE1ZDc5NjY0MTQ2OWY5ODUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0._w-MqOLUunwQpuCmYO0HJgMugauxFu8mVBoIeyZiniM)
# Cardápio Back End
## Sobre o Projeto
O Cardápio Back End é um sistema de backend desenvolvido em Java, seguindo o padrão MVC (Model-View-Controller) com o uso do Spring Boot para facilitar a configuração e o Lombok para minimizar o código boilerplate. Este projeto gerencia um cardápio digital que permite o cadastro e a consulta de comidas, incluindo preços, nomes e imagens.

## Funcionalidades
- **Cadastro de Comidas**: Permite que os usuários adicionem novos itens ao cardápio.
- **Consulta de Comidas**: Os usuários podem visualizar todos os itens disponíveis no cardápio.
- **Informações Detalhadas**: Cada item do cardápio possui informações detalhadas como preço, nome e imagem.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Facilita a configuração e o desenvolvimento de aplicações Spring.
- **Lombok**: Reduz o código boilerplate.
- **PostgreSQL**: Banco de dados utilizado para armazenar as informações dos itens do cardápio.

## Estrutura de Diretórios
A estrutura do projeto é organizada para facilitar a navegação e o gerenciamento. Abaixo está uma visão geral da estrutura de diretórios:

!Estrutura de Diretórios

### Diretórios e Arquivos Principais:
1. `controllers`: Contém `FoodController`, que gerencia o mapeamento de requisições para operações dos itens do cardápio.
2. `entities`: Inclui entidades como `Food`, `FoodRequestDTO`, `FoodResponseDTO`.
3. `repository`: Contém `FoodRepository`, que faz a interface com o banco de dados PostgreSQL.

## Como Começar
Siga estes passos para executar o Cardápio Back End na sua máquina local:

### Pré-requisitos:
Certifique-se de ter o Java JDK e o banco de dados PostgreSQL instalados.

### Passos:
1. Clone o repositório:
```bash
git clone <link-do-repositório>
cd CardapioBack
mvn install
mvn spring-boot:run
```
Agora, acesse localhost no seu navegador para interagir com o Cardápio Back End!

## Diretrizes de Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para fazer um pull request ou abrir uma issue.
Para mais detalhes sobre como contribuir, consulte nosso Guia de Contribuição.

## Licença e Agradecimentos
Cardapio Back End é licenciado sob a Licença MIT. Agradecemos a todos os contribuidores que dedicam seu tempo e esforço para o projeto.


Lembre-se de substituir os placeholders `<link-do-repositório>`, `link-para-imagem-da-estrutura`, `link-para-guia-de-contribuição` e `link-para-licença` pelos links reais do seu projeto. Espero que isso ajude a criar um README atraente e informativo para o seu projeto!
