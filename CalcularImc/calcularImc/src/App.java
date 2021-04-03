import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS (Organização Mundial de Saúde), que é usado para o diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: massa e altura.");

        System.out.println("\nDigite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.print("Digite sua massa(peso): ");
        Double massa = scanner.nextDouble();

        Double imc = massa / (altura * altura);
        System.out.println(imc);

        scanner.close();
    }
}
