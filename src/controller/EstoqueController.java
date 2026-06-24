package controller;

import model.Produto;
import service.EstoqueService;

public class EstoqueController {

    private EstoqueService service;

    public EstoqueController() {
        this.service = new EstoqueService();
    }

    public void cadastrarProduto(Produto produto) {
        service.cadastrarProduto(produto);
    }

    public Produto buscarProduto(int id) {
        return service.buscarProduto(id);
    }

    public void listarProdutos() {
        service.listarProdutos();
    }
}