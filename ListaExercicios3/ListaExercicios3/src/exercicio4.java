import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você sabe qual a sua classe eleitoral? Digite sua idade: ");
        Integer idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Não eleitor, você ainda não está liberado para poder votar.");

        } else if(idade >= 18 && idade <= 65){
            System.out.println("Eleitor obrigatório, necessário comparecer a votação.");

        } else if( (idade >= 16 && idade < 18) || idade > 65 ){
            System.out.println("Eleitor facultativo, você possui a liberdade para poder definir se irá querer votar ou não.");

        }

        scanner.close();
    }
}
