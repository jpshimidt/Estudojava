import java.util.Scanner;

public class QuadradoNumero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Vamos calcular um número ao quadrado? Por favor, digite um número: ");
        Double num = scanner.nextDouble();

        Double numQuadrado = num * num;
        System.out.println("O número " + num + " ao quadrado é: " + numQuadrado); 

        scanner.close();
    }

}
