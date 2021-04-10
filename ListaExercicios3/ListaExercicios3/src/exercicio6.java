import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Digite um número de 1 a 7 e irei te falar o dia da semana que corresponde: ");
        Integer dia = scanner.nextInt();

        switch(dia){
            case 1: System.out.println("O número 1 representa Domingo!");
            break;

            case 2: System.out.println("O número 2 representa Segunda-feira!");
            break;

            case 3: System.out.println("O número 3 representa Terça-feira!");
            break;

            case 4: System.out.println("O número 4 representa Quarta-feira!");
            break;

            case 5: System.out.println("O número 5 representa Quinta-feira!");
            break;

            case 6: System.out.println("O número 6 representa Sexta-feira!");
            break;

            case 7: System.out.println("O número 7 representa Sábado!");
            break;

            default:
                System.err.println("Digite um número válido!");
                System.exit(1);
        }

        scanner.close();
    }
}
