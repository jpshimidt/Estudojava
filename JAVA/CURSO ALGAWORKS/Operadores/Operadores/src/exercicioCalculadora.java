import java.util.Scanner;

public class exercicioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Seja bem-vindo a calculadora o Jojo!!!");
        System.out.print("Por favor, digite o primeiro número: ");

        Double numero1 = scanner.nextDouble();

        System.out.println("Obrigado!");
        System.out.print("Certo, agora digite o segundo número: ");

        Double numero2 = scanner.nextDouble();

        System.out.println("Ok, agora selecione qual será operação matemática realizada: ");

        System.out.print("[Adição = 1 // Subtração = 2 // Multiplicação = 3 // Divisão = 4] :  ");
        Integer operacaoSelecionada = scanner.nextInt();

        Double resultado = 0.0;

        if(operacaoSelecionada == 1){
            resultado = numero1 + numero2;
            System.out.println("O resultado da soma dos dois valores é: " + resultado);

        } else if(operacaoSelecionada == 2){
            resultado = numero1 - numero2;
            System.out.println("O resultado da subtração dos dois valores é: " + resultado);
        
        } else if(operacaoSelecionada == 3){
            resultado = numero1 * numero2;
            System.out.println("O resultado da multiplicação dos dois valores é: " + resultado);
        
        } else if(operacaoSelecionada == 4) {
            resultado = numero1 / numero2;
            System.out.println("O resultado da divisão dos dois valores é: " + resultado);
        
        } else {
            System.out.println("Por favor, verificar valor selecionado para a operação matemática e retornar valor válido.");
        }

        scanner.close();
    }
        
}
