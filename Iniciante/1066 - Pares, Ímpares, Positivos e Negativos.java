import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;

		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (num > 0) {
				positivo++;
			} else if (num < 0) {
				negativo++;
			}

		}

		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", impar);
		System.out.printf("%d valor(es) positivo(s)%n", positivo);
		System.out.printf("%d valor(es) negativo(s)%n", negativo);

		sc.close();

	}

}
