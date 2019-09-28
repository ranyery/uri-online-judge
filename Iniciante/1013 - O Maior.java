import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("%d eh o maior%n", n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.printf("%d eh o maior%n", n2);
		} else {
			System.out.printf("%d eh o maior%n", n3);
		}
		
		sc.close();
		
	}

}