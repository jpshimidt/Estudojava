import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Digite 20 número inteiros e irei te dizer quantos deles são pares!");

        Double numero = 0.0;
        Integer numerosPares = 0;

        for(int i=1; i<=20; i++){
            System.out.print(i + ". Número: ");
            numero = scanner.nextDouble();

            if(numero % 2 == 0){
                numerosPares++;
            }
        }
        
        System.out.println("Foram digitados " + numerosPares + " números pares.");

        scanner.close();
    }
}
