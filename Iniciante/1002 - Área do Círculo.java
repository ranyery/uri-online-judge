import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double raio, area;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}