
public class MainEx3 {
    public static void main(String[] args) {

        String[] livros = new String[10];
        livros[0] = "Codigo Limpo";
        livros[1] = "Java: Como Programar";
        livros[2] = "Estruturas de Dados";

        Biblioteca b = new Biblioteca("Central", livros);

        b.imprimirLivros();
        System.out.println("Livros disponíveis: " + b.contarLivros());
        System.out.println("Tem 'codigo Limpo'? " + b.verificarDisponibilidade("codigo Limpo"));
        System.out.println("Tem 'Interestelar'? " + b.verificarDisponibilidade("Interestelar"));
    }
}
