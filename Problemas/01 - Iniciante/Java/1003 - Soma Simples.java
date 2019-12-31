import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A, B, SOMA;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		SOMA = A + B;
		
		System.out.printf("SOMA = %d%n", SOMA);
		
		sc.close();
		
	}

}
