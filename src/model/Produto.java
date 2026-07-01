package model;

import exceptions.EstoqueInsuficienteException;
import exceptions.QuantidadeInvalidaException;

/**
 * Classe abstrata Produto.
 * Representa a base para qualquer tipo de produto no nosso sistema de estoque.
 * Serve como um "molde" obrigatório para classes filhas (como ProdutoEletronico ou ProdutoPerecivel).
 */
public abstract class Produto implements Exibivel {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    private Fornecedor fornecedor;
    
    /**
     * Construtor principal do Produto.
     * Sempre que um produto "nascer" no sistema, ele deve passar por aqui.
     * * @param id O identificador único numérico do produto.
     * @param nome O nome ou descrição do produto.
     * @param preco O preço de venda.
     * @param quantidade A quantidade inicial que vai entrar no estoque.
     * @param categoria Objeto representando a categoria do produto.
     * @param fornecedor Objeto representando o fornecedor do produto.
     * @throws QuantidadeInvalidaException Caso tentem cadastrar um estoque inicial negativo.
     * @throws IllegalArgumentException Caso tentem cadastrar um preço negativo.
     */
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

    /**
     * Realiza a entrada de mais itens deste produto no estoque.
     * * @param quantidade O número de itens que estão chegando.
     * @throws QuantidadeInvalidaException Se a quantidade informada for zero ou negativa.
     */
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("A quantidade a ser adicionada deve ser maior que zero!");
        }
        this.quantidade += quantidade;
    }

    /**
     * Realiza a saída (baixa) de itens deste produto do estoque.
     * * @param quantidade O número de itens que estão saindo.
     * @throws QuantidadeInvalidaException Se a quantidade informada for zero ou negativa.
     * @throws EstoqueInsuficienteException Se tentarem remover mais itens do que temos guardados.
     */
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