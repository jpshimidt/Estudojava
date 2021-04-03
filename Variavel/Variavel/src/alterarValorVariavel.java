import java.util.Scanner;

public class alterarValorVariavel {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento [ 1= À vista // 2= A prazo ]: ");
        Integer tipoPagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoPagamento.equals(1);
        Double juros = 0.0;
        
        if(pagamentoAVista) {

        } else {
            juros = 10.0;
        }

        Double acrescimo = valorProduto * juros / 100;
        Double valorTotal = acrescimo + valorProduto;
        System.out.println("Valor total: " + valorTotal);

        scanner.close();
    }
}
