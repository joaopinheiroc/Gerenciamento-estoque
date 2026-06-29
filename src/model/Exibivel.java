package model;

/**
 * Interface Exibivel.
 * Define um contrato padrão para qualquer classe que precise exibir suas 
 * informações detalhadas de forma estruturada no terminal do sistema.
 */
public interface Exibivel {
    
    /**
     * Exibe as informações detalhadas do objeto no console.
     * Cada classe que implementa esta interface deve fornecer a sua própria
     * lógica de formatação e exibição dos dados.
     */
    void exibirDetalhes();
}