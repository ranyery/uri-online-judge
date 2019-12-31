import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notasLidas = 0.0;
		double somaNotasValidas = 0.0;

		while (notasLidas < 2) {
			double nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				somaNotasValidas += nota;
				notasLidas++;
			} 
			else {
				System.out.println("nota invalida");
			}
		}

		double media = somaNotasValidas / notasLidas;
		System.out.printf("media = %.2f%n", media);

		sc.close();

	}
}
