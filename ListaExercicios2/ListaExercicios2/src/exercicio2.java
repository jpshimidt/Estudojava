public class exercicio2 {
    public static void main(String[] args) {
        
        Integer contador = 0;

        for(int i=1;i<=15;i++) {
            contador = contador + i;
            System.out.println(contador); // Se quiser analisar a cada passo.
        }
        
        System.out.println(contador);
    }
}
