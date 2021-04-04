import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Me diga 10 números que irei te entregar a soma!");

        Double numerosUsuario = 0.0;
        Double totalNumeros = 0.0;

        for(int i=1; i<=10; i++){
            System.out.print("O numero " + i + " será ? ");
            numerosUsuario = scanner.nextDouble();            
            totalNumeros = numerosUsuario + totalNumeros;
        }

        System.out.println("O total dos números digitados é: " + totalNumeros);   
        
        scanner.close();
    }
}
