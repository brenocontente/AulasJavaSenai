package atividades.atividade4;

public class ConstrutorDeEscadas {

    public static void desenharEscada(int degraus, char simbolo) {

        for (int i = 1; i <= degraus; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        desenharEscada(4, '#');
    }
}