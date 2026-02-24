public class Biblioteca {
    private String nome;
    private String[] livros;

    public Biblioteca() {
        this.nome = "Biblioteca Desconhecida";
        this.livros = new String[10];
    }

    public Biblioteca(String nome, String[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public void imprimirLivros() {
        System.out.println("Biblioteca: " + nome);
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println(livros[i]);
            }
        }
    }

    public int contarLivros() {
        int contador = 0;
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean verificarDisponibilidade(String nomeLivro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].equalsIgnoreCase(nomeLivro)) {
                return true;
            }
        }
    return false;
    }
}