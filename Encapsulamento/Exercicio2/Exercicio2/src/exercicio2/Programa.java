package exercicio2;

public class Programa {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.setCodigo("000001");
        pedido.setSubtotal(30.0);
        pedido.setDesconto(5.0);

        System.out.println("O código do produto é: " + pedido.getCodigo());
        System.out.println("O valor dele sem o desconto é: R$" + pedido.getSubtotal());
        System.out.println("O seu desconto é de: R$" + pedido.getDesconto());
        System.out.println("Portanto, o total será: R$" + pedido.getTotal());
    }
}
