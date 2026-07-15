package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void imprimirSaudacao(String nome){
    System.out.println("Olá, " + nome + "! Seja bem-vindo");
    }

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        imprimirSaudacao(nome);

        entrada.close();
    }
}
