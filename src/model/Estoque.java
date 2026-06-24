package model;
import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {

        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println("---------------------");
        }
    }

    public Produto buscarProdutoPorId(int id) {

        for (Produto produto : produtos) {

            if (produto.getId() == id) {
                return produto;
            }
        }

        return null;
    }
}
