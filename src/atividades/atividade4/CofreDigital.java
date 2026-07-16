package atividades.atividade4;

import java.util.Scanner;

public class CofreDigital {

    public static void abrirCofre() {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite o código do cofre: ");
            codigo = scanner.nextInt();

            if (codigo == 9999) {
                System.out.println("Cofre Aberto!");
                return;
            } else {
                tentativas--;

                if (tentativas > 0) {
                    System.out.println("Código Errado. Restam " + tentativas + " tentativas.");
                } else {
                    System.out.println("Cofre Bloqueado!");
                }
            }
        }
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}