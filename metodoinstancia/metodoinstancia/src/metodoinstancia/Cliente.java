package metodoinstancia;

public class Cliente {
    
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    String nomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }
}
