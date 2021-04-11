import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String[] letras = new String[10];
            Integer vogais = 0;
            Integer consoantes = 0;

            for(int i = 0; i<letras.length; i++) {
            System.out.print("Olá! Digite 10 letras: ");
            letras[i] = scanner.nextLine();
            }
        
            for(int j=0;j<letras.length;j++){
                
                if(letras[j].equalsIgnoreCase("a") || letras[j].equalsIgnoreCase("e") || letras[j].equalsIgnoreCase("i") || letras[j].equalsIgnoreCase("o") || letras[j].equalsIgnoreCase("u")){
                    vogais++;
                } else {
                    consoantes++;
                }
            }

            System.out.println("Foram digitadas " + vogais + " vogais. E " + consoantes + " consoantes.");

        scanner.close();
    }
}
