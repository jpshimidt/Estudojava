import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá!!! Preencha abaixo a idade de 20 pessoas e irei te dizer a média da soma do total das idades:");

        Double idade = 0.0;
        Double totalIdade = 0.0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i + ". Idade: ");
            idade = scanner.nextDouble();
            totalIdade = idade + totalIdade;
        }
   
        Double mediaIdade = totalIdade / 20;
        System.out.println("A média do total da soma das idade é: " + mediaIdade + " anos.");


        scanner.close();
    }
}
