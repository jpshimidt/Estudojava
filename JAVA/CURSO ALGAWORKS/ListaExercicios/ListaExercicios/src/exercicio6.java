import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá! Digite um número inteiro e irei te mostrar o antecessor e seu sucessor: ");
        Integer numero = scanner.nextInt();

        Integer numeroantecessor = numero - 1;
        Integer numerosucessor = numero + 1;

        System.out.println("O número digitado foi o " + numero + " e seu antecessor é o " + numeroantecessor + " e seu sucesssor é " + numerosucessor);
        
        scanner.close();
    }
}
