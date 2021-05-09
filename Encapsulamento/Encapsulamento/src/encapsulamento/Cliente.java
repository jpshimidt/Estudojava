package encapsulamento;

public class Cliente {
    String nome;
    String telefone;
    
    String getNome(){
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getTelefone(){
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
