package dia2;


import java.util.Scanner;

public class Main {
    public static void exercicio1(){

        System.out.println("Digite um número inteiro: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x % 2==0)
            System.out.println("O número é par");
        else
            System.out.println("O número é impar");
    }

    public static void exercicio2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int x = scanner.nextInt();

        if(x >= 5 && x <=7)
            System.out.println("Infantil A");
        else if (x >=8 && x <=11)
            System.out.println("Infantil B");
        else if (x >=12 && x<=13)
            System.out.println("Juvenil A");
        else if (x >=14 && x<=17)
            System.out.println("Juvenil B");
        else if (x >=18)
            System.out.println("Adulto");
    }
    public static void exercicio3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int y = scanner.nextInt();

        if (x<y)
            System.out.println(x);
        else
            System.out.println(y);
    }
    public static void exercicio3b(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int y = scanner.nextInt();

        if (x>y)
            System.out.println(x);
        else
            System.out.println(y);

    }

    public static void exercicio4(){

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        for(int i=0; i<=9; i++) {
            System.out.println("Digite um número: ");
            int x = scanner.nextInt();


            if (x > num)
                num = x;
        }
        System.out.println(num);
    }


    public static void main( String[] args ) {
        exercicio4();
    }
}
