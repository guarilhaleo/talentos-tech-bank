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

        if (x==y)
            System.out.println("Os números são iguais!");
        else if (x<y)
            System.out.println(x + "é maior! ");
        else
            System.out.println(y + "é maior!");
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
        int soma = 0;
        int menor = 0;
        for(int i=0; i<=9; i++) {
            System.out.println("Digite um número: ");
            int x = scanner.nextInt();
            soma = soma + num;



            if (x > num)
                num = x;
            else if (x < menor)
                menor = x;

        }
        System.out.println("O maior número é" + num);
        System.out.println("O menor número é" + menor);
        System.out.println("A média dos números é é" + num/10.0);


    }

    public static void exercicio5(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();

        System.out.println("Digite um numero: ");
        int b = scanner.nextInt();

        System.out.println("Digite 1 para adição, 2 para subtração, 3 para multiplicação e 4 para divisão: ");

        int c = scanner.nextInt();

        switch (c){

            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Opção inválida!!");

        }

    }

    public static void exercicio6(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Jogador 1 - Digite 1 para PEDRA, 2 para PAPEL ou 3 para TESOURA: ");
        int a = scanner.nextInt();

        System.out.println("Jogador 2 - Digite 1 para PEDRA, 2 para PAPEL ou 3 para TESOURA: ");
        int b = scanner.nextInt();

        if(a==b)
            System.out.println("Empate");
        else if (a==1 && b==2 || a==2 && b==3 || a==3 && b==1)
            System.out.println("Jogador 2 venceu!");
        else if (a==1 && b==3 || a==2 && b==1 || a==3 && b==2)
            System.out.println("Jogador 1 venceu!");


    }


    public static void main( String[] args ) {
        exercicio4();
    }

}
