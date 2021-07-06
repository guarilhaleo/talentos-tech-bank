package dia5;

public class Main {

    public static void exercicio1() {
        /*
        int[] saldos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int i = 19; i > -1; i--) {
            System.out.println(saldos[i]);
        }*/

        int[] saldos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int i = saldos.length - 1; i > -1; i--) {
            System.out.println(saldos[i]);
        }

    }

    public static void exercicioGrupo(){

        // valores a serem ordenados
        int vetor[] = {3,5,10,8,1,3};
        // armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;

        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;

            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        // exibe os números na tela
        String numerosOrdenados = "";
        for (int n : vetor) {
            numerosOrdenados += n+"-";
        }
        for  (int i = 0; i < vetor.length ; i++) {
            System.out.print(vetor[i] + "-");

        }



    }


    public static void main( String[] args ) {

        exercicioGrupo();

        /*
        double saldoConta1 = 10;
        double saldoConta2 = 20;
        double saldoConta3 = 30;

        double[] saldos = new double[10];
        saldos[0] = 10;
        saldos[1] = 20;
        saldos[2] = 30;
        //...
        saldos[9] = 100;

        double[] saldos = {10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i < saldos.length; i++){
            System.out.println(saldos[i]);*/



        }

    }

