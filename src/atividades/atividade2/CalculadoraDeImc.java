package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraDeImc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25.0) {
            System.out.println("Peso normal.");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        scanner.close();
    }
}