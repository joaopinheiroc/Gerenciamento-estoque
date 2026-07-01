package view;

import model.Produto;
import java.util.Scanner;
import java.util.List;

/**
 * Camada de visualização (View) baseada em console.
 * Responsável por gerenciar toda a interação direta com o usuário,
 * centralizando a renderização de menus, formatação de listagens 
 * e mecanismos de entrada de dados via terminal.
 */
public class TerminalView {
    
    private Scanner scanner;
    
    /**
     * Construtor padrão que inicializa o leitor de fluxo de entrada do console.
     */
    public TerminalView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exibe uma mensagem textual comum acompanhada de uma quebra de linha.
     *
     * @param mensagem O texto informativo ou de alerta a ser exibido.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Renderiza o cabeçalho e todas as opções operacionais do menu principal.
     */
    public void exibirMenu() {
        System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE ESTOQUE ===");
        System.out.println("1 - Adicionar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Buscar Produto por ID");
        System.out.println("4 - Dar Entrada no Estoque");
        System.out.println("5 - Dar Saída no Estoque");
        System.out.println("0 - Sair");
    }

    /**
     * Captura o número digitado pelo usuário correspondente à opção do menu.
     *
     * @return O número inteiro da opção selecionada.
     */
    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    /**
     * Exibe um enunciado instrutivo e captura um número inteiro genérico.
     *
     * @param mensagem O texto explicativo exibido antes da inserção do dado.
     * @return O número inteiro fornecido pelo usuário.
     */
    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    
    /**
     * Solicita a digitação de um número inteiro e força a repetição da leitura 
     * enquanto o valor inserido for negativo, blindando a entrada da interface.
     *
     * @param mensagem O texto explicativo exibido antes da inserção do dado.
     * @return Um valor inteiro maior ou igual a zero garantido.
     */
    public int lerInteiroPositivo(String mensagem) {
        int valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            scanner.nextLine(); 
            
            if (valor < 0) {
                System.out.println("Erro: O valor não pode ser negativo. Digite novamente!");
            }
        } while (valor < 0);
        
        return valor;
    }

    /**
     * Exibe um enunciado instrutivo e captura uma linha de texto.
     *
     * @param mensagem O texto explicativo exibido antes da inserção do dado.
     * @return A sequência de caracteres digitada pelo usuário.
     */
    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    /**
     * Exibe um enunciado instrutivo e captura um valor numérico com ponto flutuante (double).
     *
     * @param mensagem O texto explicativo exibido antes da inserção do dado.
     * @return O valor double fornecido pelo usuário.
     */
    public double lerDouble(String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    /**
     * Solicita a digitação de um número double e força a repetição da leitura 
     * enquanto o valor inserido for negativo, garantindo consistência para preços.
     *
     * @param mensagem O texto explicativo exibido antes da inserção do dado.
     * @return Um valor double maior ou igual a zero garantido.
     */
    public double lerDoublePositivo(String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextDouble();
            scanner.nextLine(); 
            
            if (valor < 0) {
                System.out.println("Erro: O valor não pode ser negativo. Digite novamente!");
            }
        } while (valor < 0);
        
        return valor;
    }

    /**
     * Exibe a listagem completa dos produtos contidos na coleção recebida.
     * Caso a lista esteja vazia, apresenta uma mensagem informativa específica.
     *
     * @param produtos A coleção de objetos estruturados do tipo Produto a ser impressa.
     */
    public void exibirListaDeProdutos(List<Produto> produtos) {
        System.out.println("\n=== PRODUTOS EM ESTOQUE ===");
        if(produtos.isEmpty()) {
            System.out.println("O estoque está vazio no momento.");
        } else {
            for (Produto produto : produtos) {
                produto.exibirDetalhes();
                System.out.println("------------------------------------");
            }
        }
    }

    /**
     * Exibe os dados detalhados de um produto específico.
     * Caso o objeto recebido seja nulo, emite um aviso de não localização.
     *
     * @param produto O objeto do produto cujas informações serão renderizadas.
     */
    public void exibirDetalhesProduto(Produto produto) {
        System.out.println("\n=== DETALHES DO PRODUTO ===");
        if(produto != null) {
            produto.exibirDetalhes();
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println("------------------------------------");
    }
}