import java.util.Scanner;

public class exercicioPassouNoConcurso {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Vamos descobrir se você passou no concurso?");

        System.out.println("Para poder ser aprovado no concurso é necessário que a soma das duas provas sejam maior que 150 pontos, sendo que notas menores que 60 (Em qualquer uma das provas) é motivo de desqualificação.");

        System.out.print("Por favor, digite a sua nota na matéria PORTUGUÊS: ");
        Double notaAlunoPortugues = scanner.nextDouble();

        System.out.print("Por favor, digite a sua nota na matéria MATEMÁTICA: ");
        Double notaAlunoMatematica = scanner.nextDouble();

        Integer notaMinimaPorMateria = 60;
        Double somaDasNotas = notaAlunoMatematica + notaAlunoPortugues;

        if(somaDasNotas >= 150 && (notaAlunoMatematica >= notaMinimaPorMateria) && (notaAlunoPortugues >= notaMinimaPorMateria)) {
            System.out.println("Parabéns!!! Você foi aprovado no concurso!!!");
        } else {
            System.out.println("Não foi dessa vez, mas continue tentando!");
        }

        scanner.close();
    }
}