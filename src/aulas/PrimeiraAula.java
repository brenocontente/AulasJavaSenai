package aulas;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        String nome = "Breno";
        int idade = 30;
        String professor = "Carlos";
        int anoNascimento = 1996;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(professor);
        System.out.println(anoNascimento);

        Scanner entrada = new Scanner(System.in);

        nome = entrada.nextLine();
        System.out.println(nome);

        entrada.close();
    }
}