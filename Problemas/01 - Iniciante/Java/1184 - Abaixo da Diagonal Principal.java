import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char operacao = input.next().charAt(0);
		
		double[][] matriz = new double[12][12];
		
		double soma = 0;
		int qtdValoresSomados = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = input.nextDouble();
				if (i != j && i > j) {
					soma += matriz[i][j];
					qtdValoresSomados++;
				}
			}
		}
		
		switch (operacao) {
			case 'S':
				System.out.printf("%.1f%n", soma);
				break;
			case 'M':
				double media = soma / qtdValoresSomados;
				System.out.printf("%.1f%n", media);
		}
		
		input.close();

	}

}
