import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdValores = input.nextInt();
		
		int qtdMultiplos2 = 0;
		int qtdMultiplos3 = 0;
		int qtdMultiplos4 = 0;
		int qtdMultiplos5 = 0;
		
		for (int i = 0; i < qtdValores; i++) {
			int valor = input.nextInt();
			if (valor % 2 == 0) {
				qtdMultiplos2++;
			}
			if (valor % 3 == 0) {
				qtdMultiplos3++;
			}
			if (valor % 4 == 0) {
				qtdMultiplos4++;
			}
			if (valor % 5 == 0) {
				qtdMultiplos5++;
			}
		}
		
		System.out.printf("%d Multiplo(s) de 2%n", qtdMultiplos2);
		System.out.printf("%d Multiplo(s) de 3%n", qtdMultiplos3);
		System.out.printf("%d Multiplo(s) de 4%n", qtdMultiplos4);
		System.out.printf("%d Multiplo(s) de 5%n", qtdMultiplos5);
		
		input.close();

	}
	
}