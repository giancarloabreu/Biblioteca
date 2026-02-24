public class MainEx3 {
    public static void main(String[] args) {

        String[] livros = new String[10];
        livros[0] = "Codigo Limpo";
        livros[1] = "Java: Como Programar";
        livros[2] = "Estruturas de Dados";

        Biblioteca bib = new Biblioteca("Central", livros);

        bib.imprimirLivros();
        System.out.println("Livros disponíveis: " + bib.contarLivros());
        System.out.println("Tem 'codigo Limpo'? " + bib.verificarDisponibilidade("codigo Limpo"));
        System.out.println("Tem 'Interestelar'? " + bib.verificarDisponibilidade("Interestelar"));
    }
}
