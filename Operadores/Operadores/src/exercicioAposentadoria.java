import java.util.Scanner;

public class exercicioAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final Integer idadeMinima = 55;
        final Integer contribuicaoMinima = 25;

        System.out.println("Você já pode se aposentar? Preencha os campos abaixo e descubra!!!");

        System.out.print("Qual a sua idade? ");
        Integer idade = scanner.nextInt();

        System.out.print("Por quanto tempo você já contribuiu para a previdência? ");
        Integer contribuicaoPrevidencia = scanner.nextInt();
        
        if(idade >= idadeMinima && contribuicaoPrevidencia >= contribuicaoMinima){
            System.out.println("Uhuuu! Você já possui direito de se aprosentar");
        } else {
            System.out.println("Você ainda não possui direito de se aprosentar.");
        }
        
        scanner.close();
    }
}
