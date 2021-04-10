import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá!!! Me informe um número inteiro e irei te dizer se ele é impar ou par: ");
        Integer numero = scanner.nextInt();

        Integer condicao = numero % 2;

        if(condicao == 0){
            System.out.println("O número " + numero + " é par!");
        }else {
            System.out.println("O número " + numero + " é impar!");
        }
        
        scanner.close();
    }
}
