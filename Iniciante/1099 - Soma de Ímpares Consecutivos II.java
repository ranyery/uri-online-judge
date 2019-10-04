import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			int somaImpares = 0;
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if ( A > B && A > (B + 1) ) {
				while ( A > B && A > (B + 1) ) {
					if (B % 2 == 0) {
						B++;
						somaImpares += B;
					}
					else if ( B % 2 == 1 && (B + 2) < A ) {
						B += 2;
						somaImpares += B;
					} 
					else {
						B++;
					}
				}
				System.out.println(somaImpares);
			}
			else if ( A < B && (A + 1) < B ) {
				while ( A < B && (A + 1) < B ) {
					if (A % 2 == 0) {
						A++;
						somaImpares += A;
					}
					else if ( A % 2 == 1 && (A + 2) < B ) {
						A += 2;
						somaImpares += A;
					} 
					else {
						A++;
					}
				}
				System.out.println(somaImpares);
			} 
			else {
				System.out.println(0);
			}
		}

		sc.close();

	}

}
