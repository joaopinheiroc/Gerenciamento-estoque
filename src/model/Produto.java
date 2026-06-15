public abstract class Produto implements Exibivel {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    private Fornecedor fornecedor;
    
    public Produto(int id, String nome, double preco, int quantidade, Categoria categoria, Fornecedor fornecedor) {
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a ser adicionada deve ser maior que zero!");
        }
        this.quantidade += quantidade;
    }
    public void removerEstoque(int quantidade) {
        if(quantidade <= 0){
           throw new IllegalArgumentException("A quantidade a ser removida deve ser maior que zero!");
        }
        if(this.quantidade < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidade -= quantidade;
    }

    @Override
    public abstract void exibirDetalhes();
}