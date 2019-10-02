import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdCoelhos = 0;
		int qtdRatos = 0;
		int qtdSapos = 0;
		
		int qtdTestes = sc.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			int qtd = sc.nextInt();
			char animal = sc.next().charAt(0);
			switch (animal) {
				case 'C':
					qtdCoelhos += qtd;
					break;
				case 'R':
					qtdRatos += qtd;
					break;
				case 'S':
					qtdSapos += qtd;
					break;
			}
		}
		
		int qtdGeral = qtdCoelhos + qtdRatos + qtdSapos;
		double percentCoelhos = (double) qtdCoelhos / qtdGeral;
		double percentRatos = (double) qtdRatos / qtdGeral;
		double percentSapos = (double) qtdSapos / qtdGeral;
		
		System.out.printf("Total: %d cobaias%n", qtdGeral);
		System.out.printf("Total de coelhos: %d%n", qtdCoelhos);
		System.out.printf("Total de ratos: %d%n", qtdRatos);
		System.out.printf("Total de sapos: %d%n", qtdSapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelhos * 100);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentRatos * 100);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentSapos * 100);

		sc.close();
		
	}

}
