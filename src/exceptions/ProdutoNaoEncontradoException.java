package exceptions;

/**
 * Exceção personalizada para indicar que um produto não foi localizado.
 * É lançada pela camada de serviço sempre que uma busca por identificador (ID) 
 * falhar em encontrar uma correspondência no inventário de produtos.
 */
public class ProdutoNaoEncontradoException extends RuntimeException{
    
    /**
     * Construtor que define a mensagem detalhada do erro de busca.
     *
     * @param mensagem O texto detalhando o motivo específico da falha.
     */
    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}