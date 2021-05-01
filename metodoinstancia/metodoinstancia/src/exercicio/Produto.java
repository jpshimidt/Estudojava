package exercicio;

public class Produto {
    String nomeProduto;
    Integer quantidadeProdutos;
    static Integer quantidadeMinima = 10;

    Boolean condicaoEstoque(){
        if(quantidadeProdutos < quantidadeMinima){
            return true;
        } else {
            return false;
        }
    }

}