package model;

/**
 * Representa uma categoria para agrupamento de produtos no sistema de estoque.
 * Permite organizar e classificar os itens cadastrados de acordo com seus 
 * respectivos setores ou características comuns.
 */
public class Categoria {
    private String nome;

    /**
     * Construtor para inicializar uma categoria.
     *
     * @param nome O nome descritivo da categoria.
     */
    public Categoria(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}