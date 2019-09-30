import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double intervalo = sc.nextDouble();
		sc.close();
		
		if (intervalo >= 0 && intervalo <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (intervalo > 25 && intervalo <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (intervalo > 50 && intervalo <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (intervalo > 75 && intervalo <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

	}

}
