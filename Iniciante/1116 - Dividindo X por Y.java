import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdDivisoes = sc.nextInt();
		
		for (int i = 0; i < qtdDivisoes; i++) {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			double quociente = (double) dividendo / divisor;
			if (divisor != 0) {
				System.out.printf("%.1f%n", quociente);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();
		
	}

}
