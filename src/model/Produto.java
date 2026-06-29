package model;

import exceptions.EstoqueInsuficienteException;
import exceptions.QuantidadeInvalidaException;

public abstract class Produto implements Exibivel {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    private Fornecedor fornecedor;
    
    public Produto(int id, String nome, double preco, int quantidade, Categoria categoria, Fornecedor fornecedor) {
        if (quantidade < 0) {
            throw new QuantidadeInvalidaException("Erro de cadastro: A quantidade inicial não pode ser negativa!");
        }
        if (preco < 0 ) {
            throw new IllegalArgumentException("Preço não pode ser negativo!"); 
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("A quantidade a ser adicionada deve ser maior que zero!");
        }
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if(quantidade <= 0){
           throw new QuantidadeInvalidaException("A quantidade a ser removida deve ser maior que zero!");
        }
        if (this.quantidade - quantidade < 0) {
            throw new EstoqueInsuficienteException("Estoque insuficiente! Você tentou remover " + quantidade + ", mas só há " + this.quantidade + " disponíveis.");
        }
        this.quantidade -= quantidade;
    }

    @Override
    public abstract void exibirDetalhes();
}