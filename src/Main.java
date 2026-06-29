import controller.EstoqueController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o Sistema de Estoque...");

        EstoqueController controller = new EstoqueController();

        controller.iniciarSistema();

        System.out.println("Programa finalizado com sucesso.");
    }
}