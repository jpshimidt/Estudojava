import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá, me diga o nome e a idade de 10 pessoas, e irei te dizer qual é a mais nova!");

        String pessoaMaisNova = "";
        String nome;
        Integer idade;
        Integer menorIdade = 1000;

        for(int i = 1; i <= 10; i++){
            System.out.print(i + ". Nome: ");
            nome = scanner.next();

            System.out.print(i + ". Idade: ");
            idade = scanner.nextInt();

            System.out.println("--------------------------------------------");


            if(idade < menorIdade){
                menorIdade = idade;
                pessoaMaisNova = nome;
            }
        }
        
        System.out.println("A pessoa mais nova é: " + pessoaMaisNova + ", e ele(a) possui " + menorIdade + " anos.");

        scanner.close();
    }
}
