import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int qtdValores = input.nextInt();
		int[] numeros = new int[qtdValores];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		
		int menorValor = numeros[0];
		int posicao = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= menorValor) {
				menorValor = numeros[i];
				posicao = i;
			}
		}
		
		System.out.printf("Menor valor: %d%n", menorValor);
		System.out.printf("Posicao: %d%n", posicao);
		
		input.close();

	}
}
