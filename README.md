# Consumo de api

Projeto para consumo de API de filmes.

## Para saber mais: a interface CommandLineRunner
A interface CommandLineRunner é um recurso poderoso dentro do universo do Spring Framework, amplamente utilizado no desenvolvimento de aplicações Java. Ela permite que executamos alguma ação logo após a inciialização de nossa aplicação. Pode ser muito útil, por exemplo, se quisermos carregar alguns dados em nosso banco de dados logo na inicialização da nossa aplicação.

### Como funciona?
Quando uma aplicação Spring Boot é lançada pode ocorrer váriaas operações automáticas, como a criação de beans, configuração de banco de dados, entre outros. A abertura para customização destas operações é limitada, e é aqui que a interface CommandLineRunner entra em cena.
A interface CommandLineRunner representa uma tarefa a ser executada após a inicialização do Spring Boot, ou seja, permite definir código para ser executado automaticamente quando o aplicativo é iniciado.

## Para saber mais: JsonAlias e JsonProperty
@JsonAlias e @JsonProperty são anotações em Jackson, uma biblioteca Java para processar JSON, que ajudam a mapear propriedades de classe em para campos JSON.

### @JsonProperty
Essa anotação é usada para definir o nome da propriedade JSON que está associado ao campo Java.
Quando o JSON é serializado, isto é, convertido de objetos Java para Json, o nome especificado em @JsonProperty será usado como a chave para o campo no Json de saída. Da mesma forma, quando o JSON é desserializado (convertido de Json para objetos Java), a biblioteca procura pelo nome especificado em @JsonProperty para mapear o valor JSON para o campo Java.

### @JsonAlias
É usado para definir um ou mais apelidos para o nome da propriedade JSON associada ao campo Java.
Ao desserializar, o @JsonAlias permite que a biblioteca encontre o valor JSON correspondente, mesmo que o nome da propriedade no JSON não corresponda exatamente ao nome do campo Java.
Isso é útil quando você está trabalhando com diferentes versões de um JSON ou quando deseja permitir que uma propriedade seja referenciada por nomes diferentes;