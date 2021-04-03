public class estruturaFor {
    public static void main(String[] args) {   
        
        /*for(int i = 1; i <= 5; i++){
            System.out.println(i +". Uma frase qualquer");
        }*/
    
        Double[] carrinhoDeCompras = new Double[] { 50.0, 51.0, 52.0 };
        Double total = 0.0;

        for(int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.println("Interação: " + i + ", Total: " + total);
            total = total + carrinhoDeCompras[i];           
        }

        System.out.println("Total: " + total);
    }
}
