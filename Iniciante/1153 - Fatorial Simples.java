import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int fatorial = 1;
		
		while (x > 1) {
			fatorial *= x;
			x--;
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}
}
