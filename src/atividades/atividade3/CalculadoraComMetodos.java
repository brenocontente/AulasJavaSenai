package atividades.atividade3;

import java.util.Scanner;

public class CalculadoraComMetodos {

    public static int subtrairNumeros(int x, int y){
        return x - y;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da operação é: " + resultado);
    }


    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("Calculadora de subtração");
        System.out.println("==========================");
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = entrada.nextInt();

        System.out.println("Digite outro número");
        int y = entrada.nextInt();

        imprimirResultado(subtrairNumeros(x, y));

        entrada.close();
    }
}
