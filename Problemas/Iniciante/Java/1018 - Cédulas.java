import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int notas[] = {100, 50, 20, 10, 5, 2, 1};
		int quantidade;
		
		int valor = sc.nextInt();
		
		System.out.println(valor);
		if (valor > 0 && valor < 1000000) {
			for (int i = 0; i < notas.length; i++) {
				quantidade = (valor / notas[i]);
				System.out.printf("%d nota(s) de R$ %d,00%n", quantidade, notas[i]);
				valor %= notas[i];
			}
		}
		
		sc.close();
		
	}

}
