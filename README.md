# Sistema de Gerenciamento de Estoque

Este projeto acadêmico da cadeira de POO é uma aplicação em linha de comando (CLI) desenvolvida em Java para facilitar o controle de entrada e saída de mercadorias
---

## Funcionalidades

O sistema oferece um menu interativo com validações para evitar entradas incorretas (como valores negativos). Você pode:

* **Adicionar Produto:** Cadastrar novos itens com suas informações básicas.
* **Listar Produtos:** Visualizar todos os itens armazenados no sistema.
* **Buscar Produto por ID:** Encontrar rapidamente os detalhes de um item específico.
* **Dar Entrada no Estoque:** Adicionar quantidades a produtos já existentes.
* **Dar Saída no Estoque:** Registrar a venda ou uso de um item, reduzindo sua quantidade.

---

## Tecnologias e Estrutura

O código foi construído utilizando boas práticas de Programação Orientada a Objetos (POO):

* **Java:** Linguagem base da aplicação.
* **java.time:** Utilização da biblioteca nativa do Java para manipulação e registro preciso de datas e horários nas operações do sistema.
* **Padrão MVC:** Separação clara de responsabilidades (Model, Views, Controller).
* **Tratamento de Dados:** Uso de laços de repetição e da classe `Scanner` para garantir interatividade à prova de falhas, além de listas (`Collections`) para o gerenciamento de dados em memória.

---

## Como executar

Para rodar o projeto localmente, siga estes passos:

1. Certifique-se de ter o Java (JDK) instalado no seu computador.
2. Faça o clone ou baixe os arquivos deste repositório.
3. Localize a classe principal (a que contém o método `main`) e execute-a para iniciar o sistema no console.
