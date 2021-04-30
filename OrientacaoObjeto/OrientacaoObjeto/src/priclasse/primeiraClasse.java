package priclasse;

public class primeiraClasse {
    public static void main(String[] args) {
        produto produto = new produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.00;
        produto.quantidade = 15;

        exibirQuantidadeEmEstoque(produto);
    }

    static void exibirQuantidadeEmEstoque(produto produto){
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é " + produto.quantidade + " unidades.");
    }
}
