import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdLinhas = sc.nextInt();
		
		for (int i = 1; i <= qtdLinhas; i++) {
			System.out.printf("%d", i);
			System.out.print(" ");
			System.out.printf("%d", (int) Math.pow(i, 2));
			System.out.print(" ");
			System.out.printf("%d%n", (int) Math.pow(i, 3));
		}
		
		sc.close();
		
	}

}
