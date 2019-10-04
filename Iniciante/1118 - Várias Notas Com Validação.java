import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int novoCalculo = 2;

		do {
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
			System.out.printf("novo calculo (1-sim 2-nao)%n");
			novoCalculo = sc.nextInt();
			
			while (novoCalculo != 1 && novoCalculo != 2) {
				System.out.printf("novo calculo (1-sim 2-nao)%n");
				novoCalculo = sc.nextInt();
			}

		} while(novoCalculo == 1);

		sc.close();

	}
}
