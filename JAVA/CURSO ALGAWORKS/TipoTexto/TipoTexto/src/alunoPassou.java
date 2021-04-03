import java.util.Scanner;

public class alunoPassou {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Olá! Qual foi a nota do aluno? ");

        Integer nota = scanner.nextInt();
        Boolean passou = nota > 70;

        if(passou){
            System.out.printf("Parábens, o aluno passou de ano!");
        } else {
            System.out.printf("Infelizmente, o aluno não passou de ano!");
        }

        scanner.close();
    }

}
