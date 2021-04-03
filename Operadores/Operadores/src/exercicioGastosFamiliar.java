import java.util.Scanner;

public class exercicioGastosFamiliar { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bora organizar as contas?");
        System.out.println("Por favor, preencher com os valores das contas:");

        Double contasTotal = 0.0;

        System.out.print("Qual o valor da conta de luz: ");
        contasTotal += scanner.nextDouble();

        System.out.print("Qual o valor da conta de água: ");
        contasTotal += scanner.nextDouble();

        System.out.print("Qual o valor da conta de telefone: ");
        contasTotal += scanner.nextDouble();

        System.out.print("Qual o valor da conta da escola do filho: ");
        contasTotal += scanner.nextDouble();

        System.out.print("Qual o valor da conta da fatura do cartão: ");
        contasTotal += scanner.nextDouble();

        System.out.print("Qual o valor da conta do supermercado: ");
        contasTotal += scanner.nextDouble();

        System.out.println("O valor total das contas é: " + contasTotal);
        
        scanner.close();
    }
}