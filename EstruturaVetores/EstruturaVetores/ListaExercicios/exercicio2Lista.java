import java.util.Arrays;

// https://wiki.python.org.br/ExerciciosListas

public class exercicio2Lista {
    public static void main(String[] args) {
        
        Double[] numeros = new Double[] {1.0, 3.0, 25.0, 2.0, 13.0, 7.0, 8.0, 900.0, 62.0, 75.0};

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = -numeros[i];
        }

        Arrays.sort(numeros);

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = -numeros[i];
            System.out.println(numeros[i]);
        }
    }
}
