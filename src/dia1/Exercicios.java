package dia1;

import java.util.Scanner;

public class Exercicios {



    public static void exercicio1(){
        //Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir
        // (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está
        // em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

        short y=99;
        short z=11;

        short w= y;
        y =z;
        z =w;

        System.out.println("O valor de Y é: " + y);
        System.out.println("O valor de Z é: " + z);

    }

    public static void exercicio2(){
        //Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

        System.out.println("Digite um número: ");

        Scanner x = new Scanner(System.in);

        int valor = x.nextInt();
        int antecessor = valor - 1;
        System.out.println("O antecessor de " + valor + " é: " + antecessor);

    }

    public static void exercicio3(){
    //A área do retângulo corresponde ao produto (multiplicação) da medida da base pela altura da figura, sendo
    // expressa pela fórmula: A = b x h Onde, A: área b: base h: altura Lembre-se que o retângulo é uma figura
    // geométrica plana formada por quatro lados (quadrilátero). Dois lados do...

        System.out.println("Digite a altura do retângulo: ");

        Scanner x = new Scanner(System.in);
        double valor1 = x.nextDouble();

        System.out.println("Digite a base do retângulo: ");

        Scanner y = new Scanner(System.in);
        double valor2 = x.nextDouble();

        double z = valor1 * valor2;

        System.out.println("A base do retângulo é: " + z);


    }

    public static void exercicio4(){
    //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
    // nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
        System.out.println("Digite o total de eleitores: ");

        Scanner a = new Scanner(System.in);
        int eleitores = a.nextInt();

        System.out.println("Digite o total de votos válidos: ");

        Scanner b = new Scanner(System.in);
        int validos = b.nextInt();

        System.out.println("Digite o total de votos em branco: ");

        Scanner c = new Scanner(System.in);
        int branco = c.nextInt();

        System.out.println("Digite o total de votos em nulos: ");

        Scanner d = new Scanner(System.in);
        int nulo = d.nextInt();

        System.out.println("A quantidade de votos ");
    }

    public static void main( String[] args ) {
        exercicio3();
    }



}