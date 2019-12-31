import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++ ) {
			double n1, n2, n3;
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			double mediaPonderada = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();
		
	}

}
