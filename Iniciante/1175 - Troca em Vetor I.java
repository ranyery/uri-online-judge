import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] valores = new int[20];
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = input.nextInt();
		}
		
		for (int i = 1; i <= 10; i++) {
			int x = valores[i - 1];
			int y = valores[valores.length - i];
			valores[i - 1] = y;
			valores[valores.length - i] = x;
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("N[%d] = %d%n", i, valores[i]);
		}

		input.close();

	}
}
