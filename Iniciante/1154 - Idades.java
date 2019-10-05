import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int somaNumeros = 0;
		int qtdValores = 0;
		
		do {
			somaNumeros += num;
			qtdValores++;
			num = sc.nextInt();
		} while (num >= 0);
		
		double media = (double) somaNumeros / qtdValores;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}
}
