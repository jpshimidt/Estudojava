import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá! Digite as informações abaixo para a soma do total:");
        System.out.print("Qual a porcentagem do IPI: % ");
        
        Double ipi = scanner.nextDouble();
        Double ipiPorcentagem = (ipi/100)+1;
        
        System.out.print("Qual o valor do produto 1: R$");
        Double valorProduto1 = scanner.nextDouble();

        System.out.print("Qual a quantidade do produto 1: ");
        Integer quantidadeProduto1 = scanner.nextInt();

        System.out.print("Qual o valor do produto 2: R$");
        Double valorProduto2 = scanner.nextDouble();

        System.out.print("Qual a quantidade do produto 2: ");
        Integer quantidadeProduto2 = scanner.nextInt();

        Double valorTotal = ( (valorProduto1*quantidadeProduto1) + (valorProduto2 * quantidadeProduto2) ) * ipiPorcentagem;

        System.out.println("O valor total será: R$" + valorTotal);

        scanner.close();
    }
}
