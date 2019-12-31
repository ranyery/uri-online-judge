import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 5 && num < 2000) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.printf("%d^2 = %d%n", i, (i*i));
				}
			}
		}
		
		sc.close();
		
	}

}