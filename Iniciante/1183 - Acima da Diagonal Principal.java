import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[][] matriz = new double[12][12];
		
		double somaMatriz = 0;
		int qtdValoresSomados = 0;
		
		char operacao = input.next().charAt(0);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = input.nextDouble();
				if (i != j && i < j) {
					somaMatriz += matriz[i][j];
					qtdValoresSomados++;
				}
			}
		}
		
		switch (operacao) {
			case 'S':
				System.out.printf("%.1f%n", somaMatriz);
				break;
			case 'M': 
				double media = somaMatriz / qtdValoresSomados;
				System.out.printf("%.1f%n", media);
		}
		
		input.close();

	}

}
