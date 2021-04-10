import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int[] listaDeNumeros = new int[4];

        for (int i = 1; i < listaDeNumeros.length; i++){
        System.out.print("Olá! Digite 3 números: ");
        listaDeNumeros[i] = numeros.nextInt();
        }

        Arrays.sort(listaDeNumeros);

        System.out.print("Os números em ordem crescente: ");
        for(int j = 1;j < listaDeNumeros.length; j++){
            System.out.print(listaDeNumeros[j] + "; ");
        }

        numeros.close();
    }
}
