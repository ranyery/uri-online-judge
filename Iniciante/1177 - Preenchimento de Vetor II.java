import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		int[] vetor = new int[1000];
		
		int i = 0;
		
		while (i < vetor.length) {
			for (int j = 0; j < valor & i < vetor.length; j++) {
				vetor[i] = j;
				System.out.printf("N[%d] = %d%n", i, vetor[i]);
				i++;
			}
		}
		
		
		input.close();

	}
}
