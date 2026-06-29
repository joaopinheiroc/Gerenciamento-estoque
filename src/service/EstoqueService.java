package service;

import java.util.ArrayList;
import java.util.List;

import exceptions.ProdutoNaoEncontradoException;
import model.Produto;

/**
 * Serviço responsável por gerenciar as operações de estoque do sistema.
 * Centraliza a lógica de negócio para adição, verificação, listagem, busca, 
 * além da movimentação de entrada e saída de mercadorias.
 */
public class EstoqueService {

    private List<Produto> produtos;

    /**
     * Construtor padrão que inicializa a lista interna de produtos.
     */
    public EstoqueService() {
        this.produtos = new ArrayList<>();
    }
    
    /**
     * Adiciona um novo produto ao inventário após validações de integridade.
     * * @param produto O objeto Produto a ser registrado no estoque.
     * @throws IllegalArgumentException Se o produto fornecido for nulo ou se o seu ID já estiver cadastrado.
     */
    public void adicionarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto nulo!");
        }
        if (existeProdutoComId(produto.getId())) {
            throw new IllegalArgumentException("Erro Crítico: Tentativa de cadastrar ID duplicado!");
        }
        produtos.add(produto);
    }

    /**
     * Verifica se já existe algum produto cadastrado com o identificador informado.
     * * @param id O identificador numérico único a ser verificado.
     * @return true se o ID já constar no sistema, ou false caso contrário.
     */
    public boolean existeProdutoComId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return true; 
            }
        }
        return false; 
    }

    /**
     * Retorna uma lista contendo todos os produtos atualmente cadastrados no estoque.
     * * @return Uma nova lista contendo os produtos armazenados.
     */
    public List<Produto> listarProdutos() {
        return new ArrayList<>(this.produtos);
    }

    /**
     * Localiza um produto específico dentro do estoque através de seu identificador.
     * * @param id O identificador único do produto procurado.
     * @return O objeto Produto correspondente ao ID informado.
     * @throws ProdutoNaoEncontradoException Se nenhum produto for localizado com o ID especificado.
     */
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado no estoque.");
    }

    /**
     * Registra o incremento de unidades no saldo de estoque de um produto específico.
     * * @param id O identificador do produto que receberá os novos itens.
     * @param quantidade A quantidade de unidades que está entrando no estoque.
     */
    public void darEntradaEstoque(int id, int quantidade) {
        Produto produto = buscarProdutoPorId(id);
        produto.adicionarEstoque(quantidade);
    }

    /**
     * Registra a baixa de unidades no saldo de estoque de um produto específico.
     * * @param id O identificador do produto que sofrerá a redução de saldo.
     * @param quantidade A quantidade de unidades que está saindo do estoque.
     */
    public void darSaidaEstoque(int id, int quantidade) {
        Produto produto = buscarProdutoPorId(id);
        produto.removerEstoque(quantidade);
    }
}