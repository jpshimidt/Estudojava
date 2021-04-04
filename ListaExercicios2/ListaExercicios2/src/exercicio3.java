import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá!!! Qual o seu nome? ");
        String nome = scanner.next();

        for(int i=1;i<=10;i++){
            System.out.println(i + ". Então quer dizer que seu nome é " + nome);
        }
        scanner.close();
    }
}
