import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		double qtdLitros = (tempoGasto * velocidadeMedia) / 12.0;
		
		System.out.printf("%.3f%n", qtdLitros);
		
		sc.close();
		
	}

}