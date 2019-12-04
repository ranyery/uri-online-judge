import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int N = input.nextInt();
		
		while (N <= 0) {
			N = input.nextInt();
		}
		
		int soma = 0;
		
		for (int i = 0; i >= 0 && i <= N - 1; i++) {
			soma += A + i;
		}
		
		System.out.println(soma);
		
		input.close();

	}
}