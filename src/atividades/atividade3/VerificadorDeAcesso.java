package atividades.atividade3;

import java.util.Scanner;

public class VerificadorDeAcesso {

    public static boolean verificarMaioridade(int idade){
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return true;

        } else {
            System.out.println("Menor de idade");
            return false;
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        if (verificarMaioridade(idade)){
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }



    }
}
