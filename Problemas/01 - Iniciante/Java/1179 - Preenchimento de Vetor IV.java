import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		int[] par = new int[5];
		int[] impar = new int[5];
		int qtdPares = 0;
		int qtdImpares = 0;
		
		while (contador < 15) {
			
			int valor = input.nextInt();
			
			if (valor % 2 == 0) {
				par[qtdPares] = valor;
				qtdPares++;
				if (qtdPares == 5) {
					for (int i = 0; i < par.length; i++) {
						System.out.printf("par[%d] = %d%n", i, par[i]);
					}
					qtdPares = 0;
				}
			} 
			else {
				impar[qtdImpares] = valor;
				qtdImpares++;
				if (qtdImpares == 5) {
					for (int i = 0; i < impar.length; i++) {
						System.out.printf("impar[%d] = %d%n", i, impar[i]);
					}
					qtdImpares = 0;
				}
			}		
			contador++;
		}
		
		if (qtdImpares > 0) {
			for (int i = 0; i < qtdImpares; i++) {
				System.out.printf("impar[%d] = %d%n", i, impar[i]);
			}
		}
		
		if (qtdPares > 0) {
			for (int i = 0; i < qtdPares; i++) {
				System.out.printf("par[%d] = %d%n", i, par[i]);
			}
		}

		input.close();

	}
}
