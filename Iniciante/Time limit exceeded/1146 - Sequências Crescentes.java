import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		
		while (true) {
			a = sc.nextInt();
			if (a == 0) {
				break;
			} 
			else {
				for (b = 1; b < a; b++) {
					System.out.printf("%d ", b);
				}
				System.out.printf("%d%n", a);
			}
		}
		
		sc.close();
		
	}
}
