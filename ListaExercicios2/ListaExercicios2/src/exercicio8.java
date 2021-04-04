import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Preencha abaixo a idade de 20 pessoas e irei te dizer quantas são maiores de idade:");

        Integer idade;
        Integer idadeMinima = 18;
        Integer maioresDeIdade = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i + ". Idade: ");
            idade = scanner.nextInt();    
            
            if(idade >= idadeMinima) {
            maioresDeIdade++;
            }
        }
   
        System.out.print("A quantidade de pessoas maiores de idade é: " + maioresDeIdade);
        
        
        scanner.close();
    }
}
