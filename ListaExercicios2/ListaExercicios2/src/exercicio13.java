import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Digite 20 número inteiros e irei te dizer quantos deles estão entre 0 e 100!");

        Double numero = 0.0;
        Integer numerosDentroDaCondicao = 0;

        for(int i=1; i<=20; i++){
            System.out.print(i + ". Número: ");
            numero = scanner.nextDouble();

            if(numero >= 0 && numero <= 100){
                numerosDentroDaCondicao++;
            }
        }
        
        System.out.println("Foram digitados " + numerosDentroDaCondicao + " que estão entre 0 e 100.");

        scanner.close();
    }
}
