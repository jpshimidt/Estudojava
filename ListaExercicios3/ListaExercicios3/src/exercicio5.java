import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá! Vamos descobrir quantas calorias foram ingeridas no seu almoço?");
        System.out.println("Vamos começa pelo prato principal, digite o número referente ao prato escolhido");
        
        Integer caloriasTotais = 0;

        System.out.print("[1] Vegetariano; [2] Peixe; [3] Frango; [4] Carne; : ");
        Integer prato = scanner.nextInt();

            switch(prato){
                case 1: caloriasTotais = 180 + caloriasTotais;
                break;

                case 2: caloriasTotais = 230 + caloriasTotais;
                break;

                case 3: caloriasTotais = 250 + caloriasTotais;
                break;

                case 4: caloriasTotais = 350 + caloriasTotais;
                break;

                default:
                    System.err.println("Digite um número válido!");
                    System.exit(1);
            }

        System.out.println("Agora a sobremesa:");     
        System.out.print("[1] Abacaxi; [2] Sorvete diet; [3] Mouse diet; [4] Mouse chocolate; : ");
        Integer sobremesa = scanner.nextInt();

            switch(sobremesa){
                case 1: caloriasTotais = 75 + caloriasTotais;
                break;

                case 2: caloriasTotais = 110 + caloriasTotais;
                break;

                case 3: caloriasTotais = 170 + caloriasTotais;
                break;

                case 4: caloriasTotais = 200 + caloriasTotais;
                break;

                default:
                    System.err.println("Digite um número válido!");
                    System.exit(2);
            }

        System.out.println("E de bebida:");
        System.out.print("[1] Chá; [2] Suco de laranja; [3] Suco de melão; [4] Refrigerante diet; : ");
        Integer bebida = scanner.nextInt();

            switch(bebida){
                case 1: caloriasTotais = 20 + caloriasTotais;
                break;

                case 2: caloriasTotais = 70 + caloriasTotais;
                break;

                case 3: caloriasTotais = 100 + caloriasTotais;
                break;

                case 4: caloriasTotais = 65 + caloriasTotais;
                break;

                default:
                    System.err.println("Digite um número válido!");
                    System.exit(1);
            }
        
        System.out.println("Certo, o total de calorias ingeridas na refeição foi: " + caloriasTotais + " cal");

        scanner.close();
    }
}
