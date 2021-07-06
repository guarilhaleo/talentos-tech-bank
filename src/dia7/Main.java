package dia7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void ecercicio1(){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i <5; i++){
            System.out.println("Digite um número");
            numeros[i] = scanner.nextInt();
        }

       System.out.println(Arrays.toString(numeros));

       scanner.close();

    }

    public static void exercicio2(){
    //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(scanner.nextInt());
        }

        System.out.println(numeros);


        scanner.close();


    }

    public static void exercicio3(){
    //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(scanner.nextInt());
        }


        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero < 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);


        System.out.println(numeros.stream().filter(numero -> numero < 0).count());


        scanner.close();
    }

    public static void exercicio4(){
    //Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(scanner.nextInt());
        }


        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);


        System.out.println(numeros.stream().filter(numero -> numero % 2 == 0).count());


        scanner.close();

    }

    public static void exercicio5(){
    //Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara
    // adivinhar uma palavra chutando cada letra em no máximo 10 chutes, caso o
    // usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o
    // numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(scanner.nextInt());
        }


        int maiorValor = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }
        System.out.println(maiorValor);

        System.out.println(Collections.max(numeros));

        System.out.println(numeros.stream().max(Integer::compare).get());

        System.out.println(numeros.stream().mapToInt(v -> v).max().getAsInt());

        scanner.close();

    }

    public static void main( String[] args ) {

        int[] vetor = {1, 2, 3, 4};

        Integer i = 0; // int
        Short s = 0; //short
        Long l = 0L; //long
        Float f = 0f; // float
        Double d = 0.0; //double
        Character c = 'a'; // char
        String str = "";

        List<Double> lista = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));

        lista.addAll(Arrays.asList(4.0));
        lista.add(1.0);
        lista.add(2.0);
        lista.remove(0);

        System.out.println(lista);

        List<Integer> lista2 = Arrays.stream(vetor).boxed().collect(Collectors.toUnmodifiableList());

    //    for (int v : vetor) {
    //       lista2.add(v);
    //    }

        System.out.println("Lista convertida de int para Integer");
        System.out.println(lista2);


        int a = 1;
        Integer b = a;

        Integer cc = 1;
        int dd = cc;

        List<Double> notas = Arrays.asList(2d, 3d, 4d);

        notas.remove(2);

        System.out.println(notas);

        for (Double nota : notas){
            System.out.println(nota);
        }

        for (int j = 0; j < notas.size(); j++){
            System.out.println(notas.get(j));
        }

        System.out.println("For do lambda");
        notas.stream().forEach(nota -> System.out.println(nota));

        System.out.println("For lambda reduzido");
        notas.forEach(System.out::println);

        List<Integer> testeImutavel = Arrays.asList(1,2,3);
        testeImutavel = Collections.unmodifiableList(testeImutavel);

        System.out.println(testeImutavel.get(0));
        testeImutavel.remove(0);
        testeImutavel.set(0,5);

        System.out.println(testeImutavel.get(0));
    }
}
