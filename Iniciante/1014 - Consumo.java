import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaPercorrida = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		double kmPorLitro = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", kmPorLitro);
		
		sc.close();
		
	}

}
