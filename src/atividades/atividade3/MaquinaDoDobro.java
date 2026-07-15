package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {

    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número e descubra seu dobro:");

        int numero = entrada.nextInt();

        int resultado = calcularDobro(numero);

        System.out.println("O dobro do número é: " + resultado);

        entrada.close();

    }
}
