import java.util.Scanner;
public class estruturaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimirPularLinha("Escolha dentre os cursos abaixo: ");
		
        IterarComFor(cursos);

		imprimirContinuarMesmaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimirPularLinha("Escolha dentre as formas de pagamento abaixo: ");
		
        IterarComFor(formasPagamento);

		imprimirContinuarMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
            mensagemErro();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimirPularLinha("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
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
