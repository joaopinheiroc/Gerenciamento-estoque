package model;

import java.time.LocalDate;

/**
 * Representa um produto perecível no sistema de estoque.
 * Esta classe é uma especialização de Produto, adicionando características 
 * específicas para itens com tempo de vida limitado, como a data de validade.
 */
public class ProdutoPerecivel extends Produto {

    private LocalDate dataValidade;

    /**
     * Construtor completo para inicializar um produto perecível.
     * Os atributos comuns a todos os produtos são repassados para a classe mãe.
     *
     * @param id O identificador único do perecível.
     * @param nome O nome ou descrição do produto.
     * @param preco O valor comercial.
     * @param quantidade A quantidade de unidades que entrará no inventário.
     * @param categoria A categoria vinculada ao produto.
     * @param fornecedor O fornecedor parceiro.
     * @param dataValidade A data limite de validade do produto.
     */
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