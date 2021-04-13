// wiki.python.org.br/ExerciciosListas  --- EXERCICIO 6

import java.util.Scanner;

public class exercicio6Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double mediaAlunos[] = new Double[10];
        Double notasAluno[] = new Double[4];
        final Double QuantidadeNotas = 4.0;
        final Integer QuantidadeAlunos = 10;
        Double notaAluno = 0.0;
        Double somaNotas = 0.0;
        Double mediaAluno = somaNotas / QuantidadeNotas;
        Integer y=0;
        Integer alunosAprovados = 0;
        
        System.out.println("Olá! Vamos descobrir quantos alunos passaram? Para isso, digite as quatro notas de cada aluno: ");
        
        for(int j = 1; j <= QuantidadeAlunos; j++){
            System.out.println("Aluno " + j);
            for(int i = 0; i < notasAluno.length; i++){
                System.out.print("Nota: ");
                notaAluno = scanner.nextDouble();
                somaNotas = notaAluno + somaNotas;
            }

            mediaAluno = somaNotas / QuantidadeNotas;
            System.out.println("media: " + mediaAluno);

            if(mediaAluno >= 7){
                mediaAlunos[y] = mediaAluno;
                y++;
                somaNotas = 0.0;
                mediaAluno = 0.0;
            } else{
                somaNotas = 0.0;
                mediaAluno = 0.0;
            } 
        }

        for(int k = 0; k < mediaAlunos.length; k++){
            if(mediaAlunos[k] != null){
                alunosAprovados++;
            }
        }

        System.out.print("A quantidade de aluno(s) que foi/foram aprovado(s) é/são: " + alunosAprovados);
        scanner.close();
    }
}