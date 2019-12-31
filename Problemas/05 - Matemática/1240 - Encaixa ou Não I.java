import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdValores = input.nextInt();
		
		for (int i = 0; i < qtdValores; i++) {
			
			String x = input.next();
			String y = input.next();
			
			if (x.endsWith(y)) {
				System.out.println("encaixa");
			} 
			else {
				System.out.println("nao encaixa");
			}
			
		}

		input.close();
	}
	
}