import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdTestes = sc.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			int num = sc.nextInt();
			int somaDivisores = 0;
			
			for (int j = 1; j < num; j++) {
				if (num % j == 0) {
					somaDivisores += j;
				}
			}
			
			if (num == somaDivisores) {
				System.out.printf("%d eh perfeito%n", num);
			} 
			else {
				System.out.printf("%d nao eh perfeito%n", num);
			}
		}
		
		sc.close();

	}
}
