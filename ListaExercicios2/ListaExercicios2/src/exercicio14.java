import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Digite 20 número inteiros e irei te dizer quantos deles estão entre 0 e 100, quantos estão entre 101 e 200 e quantos estão acima de 200!");

        Double numero = 0.0;
        Integer numerosCondicaoUm = 0;
        Integer numerosCondicaoDois = 0;
        Integer numerosCondicaoTres = 0;

        for(int i=1; i<=20; i++){
            System.out.print(i + ". Número: ");
            numero = scanner.nextDouble();

            if(numero >= 0 && numero <= 100){
                numerosCondicaoUm++;
            } else if(numero > 100 && numero <= 200){
                numerosCondicaoDois++;
            } else if (numero > 200){
                numerosCondicaoTres++;
            }
        }
        
        System.out.println("Foram digitados " + numerosCondicaoUm + " que estão entre 0 e 100.");
        System.out.println("Foram digitados " + numerosCondicaoDois + " que estão entre 101 e 200.");
        System.out.println("Foram digitados " + numerosCondicaoTres + " que são maiores que 200.");

        scanner.close();
    }
}
