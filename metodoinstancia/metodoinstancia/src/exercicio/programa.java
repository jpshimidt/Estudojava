package exercicio;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        produto.nomeProduto = "Smartphone";
        
        System.out.print("Olá, informe a quantidade de Smartphones estão disponíveis no estoque: ");
        produto.quantidadeProdutos = scanner.nextInt();

        System.out.println("Necessário repor estoque do produto " + produto.nomeProduto + "? " + produto.condicaoEstoque());
        scanner.close();
    }
}
