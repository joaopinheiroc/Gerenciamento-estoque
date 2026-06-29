package model;

/**
 * Representa um fornecedor de produtos no sistema de estoque.
 * Armazena os dados de contato essenciais da empresa ou pessoa responsável
 * pelo fornecimento das mercadorias.
 */
public class Fornecedor {
    
    private String nome;
    private String telefone;

    /**
     * Construtor para inicializar os dados de um fornecedor.
     *
     * @param nome O nome da empresa ou do fornecedor.
     * @param telefone O número de telefone de contato do fornecedor.
     */
    public Fornecedor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}