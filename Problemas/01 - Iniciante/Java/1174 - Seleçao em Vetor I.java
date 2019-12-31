import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[] numeros = new double[100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextDouble();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 10) {
				System.out.printf("A[%d] = %.1f%n", i, numeros[i]);
			}
		}
				
		input.close();

	}
}
