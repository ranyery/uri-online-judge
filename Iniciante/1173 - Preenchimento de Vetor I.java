import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = num;
			System.out.printf("N[%d] = %d%n", i, numeros[i]);
			num = num * 2;
		}
		
		input.close();

	}
}
