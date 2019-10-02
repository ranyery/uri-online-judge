import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		int contador = 0;
		
		while (contador < qtd) {
			int numero = sc.nextInt();
			if (numero < 0 && numero % 2 == -1) {
				System.out.println("ODD NEGATIVE");
			} else if (numero > 0 && numero % 2 == 1) {
				System.out.println("ODD POSITIVE");
			} else if (numero < 0 && numero % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (numero > 0 && numero % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else {
				System.out.println("NULL");
			}
			contador++;
		}
		
		sc.close();

	}

}
