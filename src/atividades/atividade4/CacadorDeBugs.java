package atividades.atividade4;

public class CacadorDeBugs {

    public static void main(String[] args) {

        int valor = 10;

        int contador = 5;

        exibirMensagens("Bem-vindo ao sistema", 1);

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);
            contador--;
        }
    }

    public static void exibirMensagens(String texto, int repeticoes) {

        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}