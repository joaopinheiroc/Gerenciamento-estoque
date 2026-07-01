package model;

/**
 * Representa um produto eletrônico no sistema de estoque.
 * Esta classe é uma especialização de Produto, adicionando características 
 * específicas para eletrônicos, como o tempo de garantia de fábrica.
 */
public class ProdutoEletronico extends Produto {

    private int garantiaMeses;

    /**
     * Construtor completo para inicializar um produto eletrônico.
     * Os atributos comuns a todos os produtos são repassados para a classe mãe.
     *
     * @param id O identificador único do eletrônico.
     * @param nome O nome ou modelo do dispositivo.
     * @param preco O valor comercial.
     * @param quantidade A quantidade de unidades que entrará no inventário.
     * @param categoria A categoria vinculada ao produto.
     * @param fornecedor O fornecedor parceiro.
     * @param garantiaMeses O tempo de cobertura da garantia dado em meses.
     */
    public ProdutoEletronico( 
            int id,
            String nome,
            double preco,
            int quantidade,
            Categoria categoria,
            Fornecedor fornecedor,
            int garantiaMeses){

            super(id, nome, preco, quantidade, categoria, fornecedor);
            this.garantiaMeses = garantiaMeses;
        }

    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Categoria: " + getCategoria().getNome());
        System.out.println("Fornecedor: " + getFornecedor().getNome());
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }

}