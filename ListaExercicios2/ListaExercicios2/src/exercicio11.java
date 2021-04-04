import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Me diga 20 números!");

        final Double NumeroMinimo = 8.0;
        Integer contador = 0;

        for(int i = 1; i <= 20 ; i++){
            System.out.print(i + ". número: ");
            Double numero = scanner.nextDouble();

            if(numero > NumeroMinimo){
                contador++;
            }
        }
        
        System.out.println(contador + " dos números digitados são maiores que 8.");

        scanner.close();
    }
}
