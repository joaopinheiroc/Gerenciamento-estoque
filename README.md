# Trabalho Final de POO: Sistema de Gerenciamento de Estoque

Este repositório contém o código-fonte do Sistema de Gerenciamento de Estoque de Mercado, desenvolvido como requisito para a disciplina de Programação Orientada a Objetos (POO). O sistema foi construído na linguagem Java.

## Descrição Geral

O objetivo principal da aplicação é realizar o controle de mercadorias armazenadas no estoque de um mercado. O sistema permite operações fundamentais como cadastro, listagem, busca e movimentação de produtos. A interface com o usuário é feita inteiramente via terminal, utilizando menus baseados em texto para a execução das funcionalidades.

## Funcionalidades do Sistema

* **Cadastro de Produtos:** Armazenamento de informações como identificador, nome, preço, quantidade em estoque, categoria e fornecedor.
* **Controle de Movimentação:** Registro de entrada e saída de mercadorias para atualização das quantidades em estoque.
* **Gestão de Produtos Específicos:** Diferenciação entre tipos de produtos. O sistema adota a classe `LocalDate` (java.time) para o controle da data de validade de produtos perecíveis, além de registrar atributos específicos para produtos eletrônicos, como o tempo de garantia.