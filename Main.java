public class Main {

    public static void main(String[] args) {

        BibliotecaController controller = new BibliotecaController();

        controller.cadastrarLivro("Dom Casmurro", "Machado de Assis");
        controller.cadastrarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        System.out.println("Livros cadastrados:");
        controller.mostrarLivros();
    }
}
