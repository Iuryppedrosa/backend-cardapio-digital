![](https://github.com/Iuryppedrosa/frontend-cardapiot-digital/blob/main/320213383-a1092278-ac1b-4da2-b6b5-c5d2de286ef7.png?raw=true)
![](https://github.com/Iuryppedrosa/frontend-cardapiot-digital/blob/main/320213381-f3c324cb-f017-41bb-8eb5-9c8d2c90fc82.png?raw=true)
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
