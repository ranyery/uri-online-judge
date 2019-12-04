import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			int numero = input.nextInt();
			if (numero % 2 == 0) {
				System.out.println(0);
			} 
			else {
				System.out.println(1);
			}
		}

		input.close();

	}

}
