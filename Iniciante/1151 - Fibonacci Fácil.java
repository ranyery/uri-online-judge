import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int qtdValores = input.nextInt();
		int[] fibonacci = new int[qtdValores];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		for (int i = 0; i < fibonacci.length - 1; i++) {
			System.out.printf("%d ", fibonacci[i]);
		}
		
		System.out.println(fibonacci[qtdValores - 1]);
				
		input.close();

	}
}
