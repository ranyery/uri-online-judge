import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		if (A == B) {
			System.out.println(A);
		} else if (A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
		
		input.close();
		
	}
	
}