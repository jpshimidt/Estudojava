import java.util.Scanner;

public class exercicioTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double tc = 0.0;

        imprimir("Olá! Vamos descobrir as temperaturas equivalentes em outras unidades? Digite uma temperatura em Celsius (°C): ");

        tc = scanner.nextDouble();

        imprimirNaProximaLinha("------------------------------------------------------------");

        imprimirNaProximaLinha("Temperaturas:");
        imprimirNaProximaLinha(tc + " °C");
        imprimirNaProximaLinha(temperaturaKelvin(tc) + " K");
        imprimirNaProximaLinha(temperaturaFahrenheint(tc) + " F");
        imprimirNaProximaLinha(temperaturaRankine(tc) + " Ra");
        imprimirNaProximaLinha(temperaturaReaumur(tc) + " Re");

        scanner.close();
    }

    static void imprimir(String texto){
        System.out.print(texto);
    }

    static void imprimirNaProximaLinha(String texto){
        System.out.println(texto);
    }

    public static Double temperaturaKelvin(Double tc){
        Double tk = tc + 273.15;
        return tk;
    }

    public static Double temperaturaFahrenheint(Double tc){
        Double tf = (tc * 1.8) + 32;
        return tf;
    }

    public static Double temperaturaReaumur(Double tc){
        Double tre = tc * 0.8;
        return tre;
    }

    public static Double temperaturaRankine(Double tc){
        Double tra = (tc * 1.8) + 32 + 459.67;
        return tra;
    }

}
