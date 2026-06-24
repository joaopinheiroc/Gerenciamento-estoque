public class ProdutoEletronico extends Produto {

    private int garantiaMeses;

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
