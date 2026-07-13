package atividades.atividade2;

import java.util.Scanner;

public class CaixaDeLoja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto;
        double valorDesconto;
        double valorFinal;

        if (valorCompra < 100) {
            desconto = 0;
        } else if (valorCompra < 300) {
            desconto = 0.10;
        } else {
            desconto = 0.20;
        }

        valorDesconto = valorCompra * desconto;
        valorFinal = valorCompra - valorDesconto;

        System.out.println();
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}