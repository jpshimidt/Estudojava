package exercicio1;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        produto.nome = "Smartphone";
        System.out.print("Quantos Smartphone estão disponíveis no estoque? ");
        produto.quantidade = scanner.nextInt();

        condicaoReposicao(produto);
        scanner.close();
    }

    static void condicaoReposicao(Produto produto){
        Boolean condicaoReposicao = produto.quantidade < 10;

        if(condicaoReposicao){
            System.out.println("É necessário a reposicao do  " + produto.nome + ", pois o estoque se encontra menor que 10 unidades!");
        } else {
            System.out.println("Ainda há " + produto.quantidade + " unidades de " + produto.nome);
        }
    }
        
}
