import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		do {
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A > B & A > 0 & B > 0) {
				int soma = 0;
				while (B <= A) {
					System.out.printf("%d", B);
					System.out.print(" ");
					soma += B;
					B++;
				}
				System.out.printf("Sum=%d%n", soma);
			}
			else if (A < B & A > 0 & B > 0) {
				int soma = 0;
				while (A <= B) {
					System.out.printf("%d", A);
					System.out.print(" ");
					soma += A;
					A++;
				}
				System.out.printf("Sum=%d%n", soma);
			}
			else {
				break;
			}

		} while (A > 0 & B > 0);

		sc.close();

	}

}
