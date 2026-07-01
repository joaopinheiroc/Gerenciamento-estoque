package exceptions;

/**
 * Exceção personalizada para sinalizar quantidades inválidas no sistema.
 * É lançada sempre que uma operação tentar informar ou registrar uma quantidade 
 * que viole as regras de negócio, como valores negativos ou zerados em contextos proibidos.
 */
public class QuantidadeInvalidaException extends RuntimeException {
    
    /**
     * Construtor que define a mensagem descritiva do erro de quantidade.
     *
     * @param mensagem O texto detalhando o motivo específico da falha.
     */
    public QuantidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}