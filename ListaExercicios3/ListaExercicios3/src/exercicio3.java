import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! A CEF irá conceder um crédito especial para você!!!");
        System.out.println("Esse crédito será baseado no seu saldo médio no último ano. ***Juros de 2%***");

        System.out.print("Qual o foi seu saldo médio no último ano? ");
        Double saldoMedio = scanner.nextDouble();

        Double faixaUm = saldoMedio * 1.3; // De 501 a 1000 ---> 30%
        Double faixaDois = saldoMedio * 1.4; // De 1001 a 3000 ---> 40%
        Double faixaTres = saldoMedio * 1.5; // Aciam de 3001 ---> 50%


        if(saldoMedio >= 0 && saldoMedio <= 500){
            System.out.println("Seu saldo médio foi R$" + saldoMedio + " , infelizmente você não possui direito ao crédito especial");

        } else if(saldoMedio > 500 && saldoMedio <= 1000){
            System.out.println("Seu saldo médio foi R$" + saldoMedio + " , o valor disponível para seu crédito especial é R$" + faixaUm);

        } else if(saldoMedio > 1000 && saldoMedio <= 3000){
            System.out.println("Seu saldo médio foi R$" + saldoMedio + " , o valor disponível para seu crédito especial é R$" + faixaDois);

        } else if(saldoMedio > 3000 ){
            System.out.println("Seu saldo médio foi R$" + saldoMedio + " , o valor disponível para seu crédito especial é R$" + faixaTres);

        }
        
        
        scanner.close();
    }
}
