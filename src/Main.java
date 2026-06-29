import controller.EstoqueController;

/**
 * Classe principal do sistema de gerenciamento de estoque.
 * Serve como o ponto de partida para a execução de todo o programa,
 * sendo responsável por disparar a inicialização dos componentes do sistema.
 */
public class Main {
    
    /**
     * Método nativo que serve como gatilho de inicialização do Java.
     * Instancia o controlador principal e delega o fluxo de execução para ele.
     *
     * @param args Argumentos opcionais de linha de comando
     */
    public static void main(String[] args) {
        System.out.println("Iniciando o Sistema de Estoque...");

        EstoqueController controller = new EstoqueController();

        controller.iniciarSistema();

        System.out.println("Programa finalizado com sucesso.");
    }
}