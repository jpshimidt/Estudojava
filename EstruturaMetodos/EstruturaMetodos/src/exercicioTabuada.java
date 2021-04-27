import java.util.Scanner;

public class exercicioTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimir("Olá!!! Digite um número inteiro e abaixo irá aparecer a sua tabuada: ");
        Integer numero = scanner.nextInt();

        imprimirTabuada(numero, 0); // O número 0 representa o início do contador.

        scanner.close();
    }

    public static void imprimirTabuada(Integer numero, Integer i){
        Integer resultadoMultiplicacao = numero * i;

        System.out.println(numero + " x " + i + " = " + resultadoMultiplicacao);

        if(++i <= 10){
            imprimirTabuada(numero, i);
        }
    }

    static void imprimir(String texto){
        System.out.print(texto);
    }

    static void imprimirNaProximaLinha(String texto){
        System.out.println(texto);
    }
}