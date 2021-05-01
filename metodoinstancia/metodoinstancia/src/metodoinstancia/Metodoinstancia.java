package metodoinstancia;

public class Metodoinstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Larissa";
        cliente.ultimoNome = "Shimidt";
        cliente.telefone = "11 98237-7354";
        cliente.email = "jp.shimidt@gmail.com";

        System.out.println("Nome cliente: " + cliente.nomeCompleto());
    }

}
