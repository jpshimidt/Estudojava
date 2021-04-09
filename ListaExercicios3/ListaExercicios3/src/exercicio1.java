import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá!!! Digite um número inteiro: ");
        Integer numero = scanner.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número informado é divisível por 2!!!");
        } else if( numero % 5 == 0){
            System.out.println("O número informado é divisível por 5!!!");
        } else if(numero % 10 == 0){
            System.out.println("O número informado é divisível por 10!!!");
        } else {
            System.out.println("O número informado não é divisível por 2, 5 ou 10!");
        }
        
        scanner.close();
    }
}
