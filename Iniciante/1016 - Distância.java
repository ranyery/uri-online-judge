import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int distancia = sc.nextInt();
		int tempo = (60 * distancia) / 30;
		
		System.out.printf("%d minutos%n", tempo);
		
		sc.close();
		
	}

}
