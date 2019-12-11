import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			int r1 = input.nextInt();
			int r2 = input.nextInt();
			int raioConduite = r1 + r2;
			System.out.println(raioConduite);
		}
		
		input.close();
		
	}
	
}