import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			int A = input.nextInt();
			int B = input.nextInt();
			
			int q = A / B;
			int r = Math.abs(A % B);
			
			if (A < 0 && B > 0 && r != 0) {
				q--;
				r = B - r;
			} else if (A < 0 && B < 0 && r != 0) {
				q++;
				r = -(B + r);
			}
			
			System.out.printf("%d %d%n", q, r);
		
		input.close();
		
	}
}