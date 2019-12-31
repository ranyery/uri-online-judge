import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 0) {
				numeros[i] = 1;
				System.out.printf("X[%d] = %d%n", i, numeros[i]);
			} 
			else {
				System.out.printf("X[%d] = %d%n", i, numeros[i]);
			}
		}
		
		input.close();

	}
}
