package exceptions;

/**
 * Exceção personalizada para sinalizar que o estoque disponível é insuficiente.
 * É lançada sempre que uma operação de saída ou baixa de produtos tentar 
 * remover uma quantidade maior do que o saldo atualmente disponível no inventário.
 */
public class EstoqueInsuficienteException extends RuntimeException {
    
    /**
     * Construtor que define a mensagem descritiva do erro de estoque insuficiente.
     *
     * @param mensagem O texto detalhando o motivo específico da falha.
     */
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}