package dia3;

import java.util.Scanner;

public class Main {

    public static void exercicio1(){

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

    public static void exercicio2(){
        Scanner scanner = new Scanner(System.in);




        System.out.println("Digite o numero para saber o fatorial: ");
        int x = scanner.nextInt();
        int fatorial = 1;

        for (int i=x; i>1; i--) {
             fatorial = fatorial * i;

        }
        System.out.println(fatorial);

    }


    public static void main( String[] args ) {

        exercicio2();

      /*  System.out.println("WHILE");
        int contagem = 1;

        while (contagem < 11) {
            System.out.println(contagem);
            contagem++;
        }

        System.out.println("DOHILE");
        contagem = 11;

        do {
            System.out.println(contagem);
            contagem++;
        }  while (contagem < 11) ;

        // Testando do while

        boolean condicao = true;

        do{
            if (1 > 0) {
                condicao = false;
            }
        }while (condicao); */

    }
}
