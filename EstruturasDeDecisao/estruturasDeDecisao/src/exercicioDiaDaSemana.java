import java.util.Scanner;

public class exercicioDiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 até 7: ");
        Integer dia = scanner.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            
            case 2:
                System.out.println("Hoje é Segunda-feira");
                break;
            
            case 3:
                System.out.println("Hoje é Terça-feira");
                break; 
            
            case 4:
                System.out.println("Hoje é Quarta-feira");
                break; 
            
            case 5:
                System.out.println("Hoje é Quinta-feira");
                break;
            
            case 6:
                System.out.println("Hoje é Sexta-feira");
                break;
            
            case 7:
                System.out.println("Hoje é Sábado");
                break;

            default:
                System.err.println("Número inválido.");
                System.exit(1);
        }

        scanner.close();
    }
}
