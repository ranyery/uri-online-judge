import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				cont++;
			}
		}
		
		System.out.printf("%d valores pares%n", cont);
		
		sc.close();

	}

}
