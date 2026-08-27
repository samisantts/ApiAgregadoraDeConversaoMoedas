# 💰 Conversor de Moedas

Projeto desenvolvido em **Java** com foco no aprendizado de **Programação Orientada a Objetos (POO)** e no desenvolvimento de uma aplicação de conversão de moedas.

## 🎯 Objetivo

Desenvolver um sistema capaz de trabalhar com diferentes moedas e realizar conversões utilizando cotações obtidas através de uma API externa.

O projeto está sendo desenvolvido de forma incremental, começando pela construção da lógica e da arquitetura da aplicação.

## 🛠️ Tecnologias

* Java
* Programação Orientada a Objetos (POO)
* Git
* GitHub
* IntelliJ IDEA

## 🧠 Conceitos praticados

Durante o desenvolvimento do projeto estão sendo praticados:

* Classes e objetos
* Atributos
* Métodos
* Construtores
* Encapsulamento
* Getters
* Laços de repetição
* Condicionais
* Retorno de objetos
* Organização por pacotes
* Separação de responsabilidades
* Git e GitHub

## 🔎 Funcionamento atual

O sistema possui uma classe responsável por representar as moedas e outra responsável pelo gerenciamento e busca dessas moedas.

A aplicação consegue buscar uma moeda através da sua sigla e retornar o objeto correspondente.

Exemplo:

```java
GerenciadorMoedas gerenciador = new GerenciadorMoedas();

Moeda moedaEncontrada = gerenciador.buscarMoeda("USD");
```

Fluxo:

```text
Main
 ↓
GerenciadorMoedas
 ↓
Busca pela sigla
 ↓
Encontra a moeda
 ↓
Retorna o objeto Moeda
 ↓
Main recebe a moeda
```

## 🚧 Próximos passos

* [ ] Permitir entrada de dados pelo usuário
* [ ] Melhorar o tratamento quando uma moeda não for encontrada
* [ ] Criar a classe de cotação
* [ ] Desenvolver a lógica de conversão
* [ ] Integrar uma API externa de cotações
* [ ] Trabalhar com data e hora das cotações
* [ ] Implementar tratamento de exceções
* [ ] Finalizar o sistema de conversão

## 📌 Status

🚧 **Em desenvolvimento**

Projeto desenvolvido como parte do meu processo de aprendizado em **Java, POO e Backend**, com foco em evolução da lógica de programação e construção de sistemas de forma estruturada.

## 👨‍💻 Autor

**Sami Gonçalves Santos**

Projeto desenvolvido para fins de estudo e evolução em desenvolvimento de software.
