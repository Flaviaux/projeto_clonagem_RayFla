
public class Main {
    public static void main(String[] args) {

        ItemBiblioteca livro1 = new ItemBiblioteca(
            "Dom Casmurro",
            "Machado de Assis",
            1899
        );

        ItemBiblioteca livro2 = new ItemBiblioteca(
            "O Cortiço",
            "Aluísio Azevedo",
            1890
        );

        System.out.println("=== SISTEMA DE BIBLIOTECA ===");

        livro1.exibirInformacoes();

        System.out.println("------------------");

        livro2.exibirInformacoes();
    }
}