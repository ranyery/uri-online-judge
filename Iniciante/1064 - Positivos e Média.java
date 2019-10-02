import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double positivos = 0;

		for (int i = 0; i < 6; i++) {
			double numero = sc.nextDouble();
			if (numero > 0) {
				cont++;
				positivos += numero;
			}
		}
		
		double mediaPositivos = (double) positivos / cont;

		System.out.printf("%d valores positivos%n", cont);
		System.out.printf("%.1f%n", mediaPositivos);

		sc.close();

	}

}
