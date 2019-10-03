import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			while ( (B + 1) < A ) {
				B++;
				if (B % 5 == 2 || B % 5 == 3) {
					System.out.println(B);
				}
			}
		} 
		else if (A < B) {
			while ( (A + 1) < B ) {
				A++;
				if (A % 5 == 2 || A % 5 == 3) {
					System.out.println(A);
				}
			}
		}
		
		sc.close();
		
	}

}
