package dia4;

import java.util.Scanner;

public class Main {

    public static void exercicio1(){

        // Dois números são inseridos pelo teclado. Escreva um programa para encontrar o valor
        // de um número elevado à potência de outro. (Não use o método Math.pow integrado Java)
        //potencia 2 elevado a 3 = 8
        //System.out.println(Math.pow(2,3));

        Scanner scanner= new Scanner(System.in);

        System.out.println("Didite um numero: ");
        double espacos = scanner.nextDouble();
        System.out.println("Elevado à: ");
        double y = scanner.nextDouble();

        double potencia = 1;

        for (double i=y; i>0; i--) {
            potencia = potencia *= espacos;

        }
        System.out.println(potencia);
    }

    public static void exercicio2I(){

        int i = 4;
        while (i > 0) {
            System.out.println("**********");
            i--;
        }
    }

    public static void exercicio2II() {


        int linhas = 5;

        for (int i= 1; i<= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("");
        }
    }

    public static void exercicio2III(){

        int linhas = 5;

        for (int i= 1; i<= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public static void exercicio2IV(){

        int linhas = 5;

        for (int i= 1; i<= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }
            int x = 0;
            while (x != 2 * i - 1){
                System.out.print("* ");
                x++;
            }
            System.out.print("\n");
        }

    }

    public static void exercicio2V() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.printf("%d ", i);
                k++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2VI() {
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (k != 2 * i - 1) {

                System.out.printf("%d ", l);
                k++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }

            System.out.print("\n");
        }
    }


    public static void main( String[] args ) {

        exercicio2III();


    }
}
