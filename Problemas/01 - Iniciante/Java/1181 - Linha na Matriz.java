import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[][] matriz = new double[12][12];
		
		int linha = input.nextInt();
		char operacao = input.next().charAt(0);
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = input.nextDouble();
			}
		}
		
		double soma = 0.0;
		
		for (int coluna = 0; coluna < 12; coluna++) {
			soma += matriz[linha][coluna];
		}
		
		switch (operacao) {
			case 'S':
				System.out.printf("%.1f%n", soma);
				break;
			case 'M':
				double media = soma / 12.0;
				System.out.printf("%.1f%n", media);
				break;
		}
		
		input.close();

	}
}