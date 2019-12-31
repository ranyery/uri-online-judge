import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		long[] numeros = new long[61];
		
		numeros[0] = 0;
		numeros[1] = 1;
		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i - 1] + numeros[i - 2];
		}

		int qtdTestes = input.nextInt();
		
		for (int i = 0; i < qtdTestes; i++) {
			
			int valor = input.nextInt();
			System.out.printf("Fib(%d) = %d%n", valor, numeros[valor]);
			
		}

		input.close();

	}
}
