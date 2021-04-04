import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Preencha abaixo a idade de 20 pessoas e irei te dizer a soma total das idades:");

        Integer idade = 0;
        Integer totalIdade = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i + ". Idade: ");
            idade = scanner.nextInt();
            totalIdade = idade + totalIdade;
        }
   
        System.out.println("O número total da soma das idade é: " + totalIdade + " anos.");

        scanner.close();
    }
}