import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdLinhas = sc.nextInt();

		for (int i = 1; i <= qtdLinhas; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			String espaco = " ";

			System.out.printf("%d", i);
			System.out.print(espaco);
			System.out.printf("%d", quadrado);
			System.out.print(espaco);
			System.out.println(cubo);

			System.out.printf("%d", i);
			System.out.print(espaco);
			System.out.printf("%d", quadrado + 1);
			System.out.print(espaco);
			System.out.println(cubo + 1);
		}

		sc.close();

	}

}
