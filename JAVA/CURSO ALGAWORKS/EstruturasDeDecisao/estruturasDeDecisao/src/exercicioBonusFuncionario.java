import java.util.Scanner;

public class exercicioBonusFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chegou Janeiroo!!! Época do bônus!!! Será que você tem direito? Vamos descobrir!");

        System.out.print("Primeira pergunta: Qual foi a meta de faturamento anual da empresa para o ano passado? ");
        Double faturamentoMetaAnoPassado = scanner.nextDouble();

        System.out.print("Segunda pergunta: Qual foi o faturamento anual real da empresa no ano passado? ");
        Double faturamentoRealAnoPassado = scanner.nextDouble();

        System.out.print("Terceira pergunta: Qual foi sua média salarial no ano passado? ");
        Double mediaSalarialAnoPassado = scanner.nextDouble();

        Double faturamentoMetaAnoPassadoMinimo = faturamentoMetaAnoPassado * 0.8 ; // FATURAMENTO MINIMO (80%) P/ GANHAR O BÔNUS.
        Double faturamentoMenorQueCem = mediaSalarialAnoPassado * 0.8; // 80% DE PREMIAÇÃO. 

        if(faturamentoRealAnoPassado >= faturamentoMetaAnoPassado){
            System.out.println("Parabéns!!! O valor do seu bônus será " + mediaSalarialAnoPassado);

        } else if ((faturamentoRealAnoPassado >= faturamentoMetaAnoPassadoMinimo) && (faturamentoRealAnoPassado < faturamentoMetaAnoPassado)){
            System.out.println("Parabéns, na próxima será melhor!!! O valor do seu bônus será " + faturamentoMenorQueCem);

        } else {
            System.out.println("Infelizmente não foi atingido o faturamento mínimo para se obter o bônus.");
        }

        scanner.close();
    }
}
