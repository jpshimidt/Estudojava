import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá!!! Vamos converter sua idade em dias?");
        
        System.out.print("Por favor, me fale quantos anos você possui? ");
        Integer anos = scanner.nextInt();
        
        System.out.print("Por favor, me fale a quantos meses vocês não faz aniversário? ");
        Integer meses = scanner.nextInt();
        
        System.out.print("Por favor, agora me fale a quantos dias: ");
        Integer dias = scanner.nextInt();

        // 1 ano = 365 dias ; 1 mês = 30 dias

        Integer anosXdias = anos * 365;
        Integer mesesXdias = meses * 30;

        Integer diasTotais = anosXdias + mesesXdias + dias;
        System.out.println("A sua idade convertida em dias são: " + diasTotais);

        scanner.close();

    }
}