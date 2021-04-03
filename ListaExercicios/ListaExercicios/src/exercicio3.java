import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá! Por favor, informe seu saldo para podermos aplicar o reajuste: R$");
        Double saldo = scanner.nextDouble();
        Double reajuste = 0.1 * saldo;

        Double saldoComReajuste = saldo +  reajuste;

        System.out.println("O valor com o reajuste é: R$ " + saldoComReajuste);
        
        scanner.close();
    }
}
