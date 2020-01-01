
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtdEntradas = input.nextInt();
		
		for (int i = 0; i < qtdEntradas; i++) {
			String palavra = input.next();
			double qtdLetras = palavra.length() / 100.0;
			System.out.printf("%.2f%n", qtdLetras);
		}

		input.close();

	}
	
}