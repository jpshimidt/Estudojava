public class vetores2dimensoes {
    public static void main(String[] args) {

    Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
    Double[] faturamentoFevereiro = new Double[] {1200.0, 3000.0, 4700.0};

    Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
    
    /*System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
    System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);*/

    for(int i=0; i < faturamentoAnual.length; i++){
        System.out.println("Mês: " + (i+1));

        Double[] mes = faturamentoAnual[i];

        for(int j=0; j < mes.length; j++){
            Double dia = mes[j];
            System.out.println("Dia " + (j+1) + ": R$" + dia);

        }
    }

    }
}
