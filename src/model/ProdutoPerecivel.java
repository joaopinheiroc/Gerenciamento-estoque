package model;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {

    private LocalDate dataValidade;

    public ProdutoPerecivel(int id, String nome, double preco, int quantidade, Categoria categoria, Fornecedor fornecedor, LocalDate dataValidade){

        super(id, nome, preco, quantidade, categoria, fornecedor);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade(){
        return dataValidade;
    }
        
    @Override
    public void exibirDetalhes(){
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Categoria: " + getCategoria().getNome());
        System.out.println("Fornecedor: " + getFornecedor().getNome());
        System.out.println("Data de validade: " + dataValidade);
    }

}
