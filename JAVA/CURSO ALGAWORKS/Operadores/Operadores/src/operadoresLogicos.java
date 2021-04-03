public class operadoresLogicos {
    public static void main(String[] args) {
        Boolean carrinhoMaiorQue100 = true;
        Boolean periodoDePromocao = true;

        /*Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;*/ // Lógica do E

        Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao; // Lógica do OU

        if(aplicarDesconto){
            System.out.println("Sim! Aplique o desconto!");
        } else {
            System.out.println("Não aplique o desconto!");
        }
       
    }
}
