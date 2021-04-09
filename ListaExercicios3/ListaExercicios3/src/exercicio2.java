import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Olá! Você sabe qual é o seu IMC?");
    
    System.out.print("Vamos calculá-lo! Me diga sua altura: ");
    Double altura = scanner.nextDouble();

    System.out.print("Agora me diga seu peso: ");
    Double peso = scanner.nextDouble();

    Double imc = peso / (altura * altura);

    System.out.println("Certo, o valor do seu IMC é " + imc);

    if(imc < 20){
        System.out.println("O seu IMC é menor que 20, significa que você está abaixo do peso");

    } else if(imc >= 20 && imc < 25){
        System.out.println("O seu IMC é maior que 20 e menor que 25, significa que você está no peso normal");

    } else if(imc >= 25 && imc < 30){
        System.out.println("O seu IMC é maior que 25 e menor que 30, significa que você está na faixa do sobre peso");
        
    } else if(imc >= 30 && imc < 40){
        System.out.println("O seu IMC é maior que 30 e menor que 40, significa que você está na faixa de obeso");

    } else {
        System.out.println("O seu IMC é maior que 40, significa que você está na faixa de obeso mórbido");
        
    }

    scanner.close();   
    }
}
