import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá!!! Digite qualquer número e irei somar, o stop será apenas quando for digitado um número negativo");

        Double numero = 0.0;
        Double somaNumeros = 0.0;

        for(int i=1;; i++){
            System.out.print(i + ". Número: ");
            numero = scanner.nextDouble();

            if(numero >= 0){
                somaNumeros = somaNumeros + numero;
            } else if(numero < 0){
                break;
            }
        }
        
        System.out.println("A soma dos número digitados é: " + somaNumeros);

        scanner.close();
    }
}
