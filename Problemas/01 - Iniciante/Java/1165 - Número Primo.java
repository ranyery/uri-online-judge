import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdTestes = sc.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			
			int soma = 0;
			int num = sc.nextInt();
			
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					soma += j;
				}
			}
			
			if ( (num + 1) == soma ) {
				System.out.printf("%d eh primo%n", num);
			} 
			else {
				System.out.printf("%d nao eh primo%n", num);
			}
			
		}
		
		sc.close();

	}
}
