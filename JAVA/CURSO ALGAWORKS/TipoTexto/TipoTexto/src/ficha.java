import java.util.Scanner;

public class ficha {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual é o seu primeiro nome?");
        String nome = scanner.nextLine();

        System.out.print("Qual é seu sobrenome?");
        String sobrenome = scanner.nextLine();

        System.out.printf("Então quer dizer que estou falando com " + nome + " " + sobrenome);

        scanner.close();

    }
}
