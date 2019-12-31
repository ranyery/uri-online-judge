import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		
		double X = ((B / A) - 1) * 100.0;
		
		System.out.printf("%.2f%%%n", X);
		
		input.close();

	}
	
}