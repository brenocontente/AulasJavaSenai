package atividades.atividade2;

import java.util.Scanner;

public class SistemaDeVotacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar, volte no futuro!");
        } else if ((idade >= 16 && idade <= 17) || idade > 70) {
            System.out.println("Voto facultativo, vote se quiser!.");
        } else {
            System.out.println("Você deve votar, vote com sabedoria");
        }

        scanner.close();
    }
}