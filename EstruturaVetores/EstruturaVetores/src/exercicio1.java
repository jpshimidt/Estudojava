import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] atividades = new String[5];

        for(int i = 0; i < atividades.length; i++){
            System.out.print("Me conte as cinco principais atividades que você fez no seu dia: ");
            atividades[i] = scanner.next();
        }

        System.out.print("As atividades digitadas foram: ");

        for(int j = 0; j < atividades.length; j++){
            System.out.print(atividades[j] + ". ");
        }
        



        scanner.close();
    }
}
