package service;

import java.util.ArrayList;
import java.util.List;

import exceptions.ProdutoNaoEncontradoException;
import model.Produto;

public class EstoqueService {

    private List<Produto> produtos;

    public EstoqueService() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto nulo!");
        }
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(this.produtos);
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado no estoque.");
    }

    public void darEntradaEstoque(int id, int quantidade) {
        Produto produto = buscarProdutoPorId(id);
        produto.adicionarEstoque(quantidade);
    }

    public void darSaidaEstoque(int id, int quantidade) {
        Produto produto = buscarProdutoPorId(id);
        produto.removerEstoque(quantidade);
    }
}

