
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		double valor = (Math.pow((1 + Math.sqrt(5)) / 2.0, N) - Math.pow((1 - Math.sqrt(5)) / 2.0, N)) / Math.sqrt(5);
		
		System.out.printf("%.1f%n", valor);

		input.close();

	}
	
}