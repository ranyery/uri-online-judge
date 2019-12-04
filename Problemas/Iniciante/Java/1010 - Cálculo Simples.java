import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codItem1 = sc.nextInt();
		int qtdItem1 = sc.nextInt();
		double valorItem1 = sc.nextDouble();
		int codItem2 = sc.nextInt();
		int qtdItem2 = sc.nextInt();
		double valorItem2 = sc.nextDouble();
		
		double valorTotal = (qtdItem1 * valorItem1) + (qtdItem2 * valorItem2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
