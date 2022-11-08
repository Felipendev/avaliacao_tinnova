# avaliacao_tinnova

<h2>Sistema de gerenciamento de veículos em API REST com Spring Boot com integração na AWS e integração a uma Single Page Application feita em Angular.</h2>

Tópicos envolvidos nessa implementeação: ⬇️

Setup inicial de projeto com o Spring Boot Initializer
Criação de modelo de dados para o mapeamento de entidades em bancos de dados
Desenvolvimento de operações de gerenciamento de veículos (CRUD - Cadastro, visualização, atualização e remoção de veículos do sistema).

Implantação do sistema na nuvem através do AWS - EC2
- > Link AWS⬇️:
```
http://ec2-3-92-216-66.compute-1.amazonaws.com:8080/veiculo/api
```

- > Para executar o projeto no terminal, digite o seguinte comando: ⬇️

```
mvn spring-boot:run
``` 

- > Após executar o comando acima, basta apenas acessar a massa de dados disponibilizada. Os arquivos tanto para testes em produção e local estão acessíveis na pasta⬇️:

```
api-veiculo\src\main\resources\postman_collection
```
- > Faça o importe dos arquivos no aplicativo POSTMAN

``` 
https://www.postman.com/
```

ou⬇️

- > Pode acessar também o Swagger para fazer os testes da API diretamente da AWS através do link ⬇️:

```
http://ec2-3-92-216-66.compute-1.amazonaws.com:8080/veiculo/api/swagger-ui/index.html
```

São necessários os seguintes pré-requisitos para a execução do projeto: ⬇️

Java 11 ou versões superiores.
Maven 4.0.0 ou versões superiores.
Sua IDE favorita.