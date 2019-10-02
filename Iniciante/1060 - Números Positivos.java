import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;

		for (int i = 0; i < 6; i++) {
			double numero = sc.nextDouble();
			if (numero > 0) {
				cont++;
			}
		}

		System.out.printf("%d valores positivos%n", cont);

		sc.close();

	}

}
