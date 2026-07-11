package atividades.atividade1;

import java.util.Scanner;

public class FormularioSenai {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome completo? ");
        String nome = scanner.nextLine();

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual a sua altura? ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); // Consome o Enter

        System.out.print("Qual o seu cargo? ");
        String cargo = scanner.nextLine();

        System.out.print("Qual o período você estuda no SENAI? ");
        String periodo = scanner.nextLine();

        scanner.close();

        System.out.println("\nSuas informações:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura);
        System.out.println("Cargo: " + cargo);
        System.out.println("Período: " + periodo);
    }
}