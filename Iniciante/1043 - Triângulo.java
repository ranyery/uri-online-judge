import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		if (A >= B + C || B >= A + C || C >= A + B) {
			double areaTrapezio = ((A + B) * C) / 2.0;
			System.out.printf("Area = %.1f%n", areaTrapezio);
		} else {
			double perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		
		sc.close();
		
	}

}