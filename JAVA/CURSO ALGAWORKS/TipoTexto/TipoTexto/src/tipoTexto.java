import java.util.Scanner;

public class tipoTexto {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.printf("Qual o seu nome?");
        
        String nome = scanner.nextLine(); 

        System.out.println("Olá " + nome + "!" );

        scanner.close();
    }

}