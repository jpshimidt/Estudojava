import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá! Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Ok, e quantas vezes você gostaria que ele fosse repetido na tela? ");
        Integer numeroRepeticoes = scanner.nextInt();
        
        for(int i=1;i <= numeroRepeticoes;i++){
            System.out.println(i + ". O seu nome é " + nome + " e você pediu para que ele fosse repetido " + numeroRepeticoes + " vezes");
        }

        scanner.close();
    }
}
