package model;

public class Movimentacao {
    
    private String tipo;
    private Produto produto;
    private int quantidade;

    public Movimentacao(String tipo, Produto produto, int quantidade) {
        this.tipo = tipo;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void registrar() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
    }
}
