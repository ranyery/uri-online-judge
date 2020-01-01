import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X = input.nextInt();
		int Y = input.nextInt();
		
		double ICM = (double) N / (X + Y);
		
		System.out.printf("%.2f%n", ICM);
		
		input.close();

	}
	
}