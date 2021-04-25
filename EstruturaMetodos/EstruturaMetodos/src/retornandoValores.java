public class retornandoValores {
    public static void main(String[] args) {

        Double[] premissaInicial = new Double[] {50.0, 100.0};
        Double proporcao = 20.0;

        Double resultadoFinal = regraDeTres(premissaInicial,proporcao);

        System.out.println("Resultado: " + resultadoFinal);
    }

    static Double regraDeTres(Double[] premissaInicial, Double proporcao){
        Double resultado = (premissaInicial[0] * proporcao) / premissaInicial[1];

        return resultado;
    }

}
