// https://wiki.python.org.br/ExerciciosListas

import java.util.Scanner;

public class exercicio3Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double somaDasNotas = 0.0;
        Double notas[] = new Double[4];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite as quatro notas do aluno: ");
            notas[i] = scanner.nextDouble();

            somaDasNotas =+ notas[i] + somaDasNotas;
        }

        Double mediaNotas = somaDasNotas / 4;
        
        for(int j=0; j<notas.length; j++){
            System.out.println((j+1)+ ". Nota digitada foi: " + notas[j]);
        }

            System.out.println("E a média das notas é: " + mediaNotas);

        System.out.println("");
        scanner.close();
    }
}
