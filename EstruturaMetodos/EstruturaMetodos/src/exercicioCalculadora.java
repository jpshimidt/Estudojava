import java.util.Scanner;

public class exercicioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirPularLinha("Olá! Vamos calcular?  Digite dois números: ");

        Double n1 = informeNumero(scanner);
        Double n2 = informeNumero(scanner);

        separador();

        Integer operacao = escolhaOperacao(scanner);

        separador();

        Double resultadoFinal = resultado(n1, n2, operacao);

        imprimirPularLinha("O resultado é: " + resultadoFinal);

        scanner.close();
    }

    static void separador(){
        System.out.println("-------------------------------------------");
    }

    static void imprimirContinuarMesmaLinha(String texto){
        System.out.print(texto);
    }

    static void imprimirPularLinha(String texto){
        System.out.println(texto);
    }

    static Double informeNumero(Scanner scanner) {
        System.out.println("Informe um número: ");
        return scanner.nextDouble();
    }

    static Integer escolhaOperacao(Scanner scanner) {
        System.out.println("Operações disponíveis: ");
        
        String[] operacoes = new String[] {"Adição", "Subtração", "Multiplicação", "Divisão"};

        for(int i=0; i < operacoes.length;i++) {
        System.out.println("[ " + i + " ] " + operacoes[i]);
        }

        System.out.print("Escolha qual operação você deseja: ");
        return scanner.nextInt();
    }

    static Double adicao(Double n1, Double n2){
        return n1 + n2;
    }

    static Double subtracao(Double n1, Double n2){
        return n1 - n2;
    }

    static Double multiplicacao(Double n1, Double n2){
        return n1 * n2;
    }

    static Double divisao(Double n1, Double n2){
        return n1 / n2;
    }

    static Double resultado(Double n1, Double n2, Integer operacao){
        Double resultado = 0.0;

        switch(operacao){

            case 0:
                resultado = adicao(n1, n2);
                break;
            case 1:
                resultado = subtracao(n1, n2);
                break;
            case 2:
                resultado = multiplicacao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
                break;
            default:
                System.out.println("Escolha uma operação válida!");
                System.exit(0);
        }
        return resultado;

    }
}