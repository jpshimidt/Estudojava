import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá!!! Me fale um número inteiro que irei te mostrar a tabuada dele: ");
        Integer numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            Integer numeroXi = numero * i;
            System.out.println(numero + " x " + i + " = " + numeroXi );
        }
        
        scanner.close();
    }
}
