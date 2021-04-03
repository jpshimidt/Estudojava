import java.util.Scanner;

public class exercicioFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo a loja ousada do JOJO!");
        System.out.print("Por favor, informe o valor do produto selecionado: ");
        Double valorProduto = scanner.nextDouble();
        
        Double frete = 15.00;

        if(valorProduto < 100){
            Double valorMaisFrete = valorProduto + frete;
            System.out.println("O valor do produto é menor que R$100.00 , portanto será cobrado o valor do frete de R$ 15.00 ");
            System.out.println("O valor total a ser pago será: R$ " + valorMaisFrete);
        } else {
            System.out.println("O valor do produto é maior que R$100.00 , portanto não será cobrado o valor do frete!");
            System.out.println("O valor total a ser pago será: R$ " + valorProduto);
        }
        
        System.out.println("Obrigado pela compra, volte sempre :)");

        scanner.close();
    }
}
