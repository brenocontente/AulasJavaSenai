import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println();
        System.out.println("A média das suas notas é: " + media);

        if (media >= 7.0) {
            System.out.println("Você está aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Você está em recuperação.");
        } else {
            System.out.println("Você está reprovado.");
        }

        scanner.close();
    }
}