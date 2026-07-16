package atividades.atividade3;

import java.util.Scanner;

public class SistemaDeMonitoramento {

    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void avaliarClima(double fahrenheit) {
        if (fahrenheit >= 86) {
            System.out.println("Clima quente");
        } else {
            System.out.println("Clima ameno");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = converterParaFahrenheit(celsius);

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        avaliarClima(fahrenheit);

        entrada.close();
    }
}