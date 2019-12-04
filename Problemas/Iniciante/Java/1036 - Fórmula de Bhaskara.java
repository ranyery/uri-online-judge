import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			double raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", raiz1);
			System.out.printf("R2 = %.5f%n", raiz2);
		}
		
		sc.close();
		
	}

}
