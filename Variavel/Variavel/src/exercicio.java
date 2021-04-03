    import java.util.Scanner;

    public class exercicio {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de itens do produto: ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valorXproduto = quantidadeProduto * valorProduto;

        /*System.out.print("Digite o tipo de pagamento [ 1= À vista // 2= A prazo ]: ");
        Integer tipoPagamento = scanner.nextInt();
        Boolean pagamentoAVista = tipoPagamento.equals(1);*/

        Double percentualDesconto = 0.0;
        
        if(quantidadeProduto >= 10) {
            percentualDesconto = 10.0;
        }

        Double Desconto = valorXproduto * percentualDesconto / 100;
        Double valorTotal = valorXproduto - Desconto;
        System.out.println("Valor total: " + valorTotal);

        scanner.close();
    }
}
