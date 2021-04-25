import java.util.Scanner;

public class retornandoValores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimirPularLinha("Escolha dentre os cursos abaixo: ");
		
        IterarComFor(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiro("O curso que você deseja é o: ", scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos); 
		
        if(!posicaoValida){
            mensagemErro();
        }

		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimirPularLinha("Escolha dentre as formas de pagamento abaixo: ");
		
        IterarComFor(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiro("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
            mensagemErro();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimirPularLinha("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}

    static Integer receberNumeroInteiro(String texto, Scanner scanner){
        imprimirContinuarMesmaLinha(texto);
		Integer numero = scanner.nextInt();

        return numero;
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor){
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static void imprimirContinuarMesmaLinha(String texto){
        System.out.print(texto);
    }

    static void imprimirPularLinha(String texto){
        System.out.println(texto);
    }

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}

    static void mensagemErro(){
        System.err.println("Posição inválida!");
        System.exit(1);
    }
    
    static void IterarComFor(String[] vetor){
        for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
    }
    
}