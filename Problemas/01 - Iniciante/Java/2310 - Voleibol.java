import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		double qtdSaquesPossiveis = 0;
		double qtdBloqueiosPossiveis = 0;
		double qtdAtaquesPossiveis = 0;
		
		double qtdSaquesRealizados = 0;
		double qtdBloqueiosRealizados = 0;
		double qtdAtaquesRealizados = 0;
		
		for (int i = 0; i < qtdTestes; i++) {
			input.next();
			qtdSaquesPossiveis += input.nextInt();
			qtdBloqueiosPossiveis += input.nextInt();
			qtdAtaquesPossiveis += input.nextInt();
			qtdSaquesRealizados += input.nextInt();
			qtdBloqueiosRealizados += input.nextInt();
			qtdAtaquesRealizados += input.nextInt();
		}
		
		double qtdPontosSaque = (qtdSaquesRealizados / qtdSaquesPossiveis) * 100.0;
		double qtdPontosBloqueio = (qtdBloqueiosRealizados / qtdBloqueiosPossiveis) * 100.0;
		double qtdPontosAtaque = (qtdAtaquesRealizados / qtdAtaquesPossiveis) * 100.0;
		
		System.out.printf("Pontos de Saque: %.2f %%.%n", qtdPontosSaque);
		System.out.printf("Pontos de Bloqueio: %.2f %%.%n", qtdPontosBloqueio);
		System.out.printf("Pontos de Ataque: %.2f %%.%n", qtdPontosAtaque);
		
		input.close();
		
	}
	
}