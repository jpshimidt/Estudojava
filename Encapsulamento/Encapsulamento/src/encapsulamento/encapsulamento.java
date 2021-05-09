package encapsulamento;

public class encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Jojo");
        cliente.setTelefone("11 98237-7366");

        System.out.println("Nome cliente: " + cliente.getNome());
    }
}
