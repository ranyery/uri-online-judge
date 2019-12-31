import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 1 && num <= 1000) {
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();
		
	}

}