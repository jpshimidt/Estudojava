import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            Integer[] numeros = new Integer[20];

            System.out.println("Digite 20 números:");
            for(int i=0; i< numeros.length; i++){
                System.out.print((i+1) + ". Número: ");
                numeros[i] = scanner.nextInt();
            }

            Integer n = 0;
            Integer m = 0;
            Integer[] numerosImpar = new Integer[20];
            Integer[] numerosPar = new Integer[20];


            for(int j=0; j<numeros.length; j++){
               
                if(numeros[j] % 2 == 0){
                    numerosPar[m] = numeros[j];
                    m++; 
                } else {
                    numerosImpar[n] = numeros[j];
                    n++;
                }
            }

            System.out.print("A matriz dos números que são impar é: {");
            for(int k=0; k < numerosImpar.length; k++){
                if(numerosImpar[k] != null){
                    System.out.print(numerosImpar[k] + ",");
                }
            } System.out.println("}");

            System.out.print("A matriz dos números que são par é: {");
            for(int l=0; l < numerosPar.length; l++){
                if(numerosPar[l] != null){
                    System.out.print(numerosPar[l] + ",");
                }
            } System.out.println("}");

            System.out.print("A matriz com todos os números digitados é: {");
            for(int x=0; x < numeros.length; x++){
                if(numeros[x] != null){
                    System.out.print(numeros[x] + ",");
                }
            } System.out.println("}");

        scanner.close();
    }
}
