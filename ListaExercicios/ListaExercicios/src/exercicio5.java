import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá! Por favor informe qual o valor do seu salário: R$ ");
        Double salario = scanner.nextDouble();

        final Double salarioMinimo = 788.0;

        Double quantidadeSalariosMinimos = salario/salarioMinimo;

       /* System.out.println("A quantidade de salários mínimos é: " + Math.round(quantidadeSalariosMinimos)); ESSE FORMATO IRÁ ARREDONDAR O VALOR. */
        
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("A quantidade de salários mínimos é: " + df.format(quantidadeSalariosMinimos));

        scanner.close();
    }
}
