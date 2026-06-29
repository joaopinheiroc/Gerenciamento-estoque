package view;

import model.Produto;
import java.util.Scanner;
import java.util.List;

public class TerminalView {
    
    private Scanner scanner;
    
    public TerminalView() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirMenu() {
        System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE ESTOQUE ===");
        System.out.println("1 - Adicionar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Buscar Produto por ID");
        System.out.println("4 - Dar Entrada no Estoque");
        System.out.println("5 - Dar Saída no Estoque");
        System.out.println("0 - Sair");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    
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

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public double lerDouble(String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

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
