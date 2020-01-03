import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			
			int qtdTestes = input.nextInt();
			
			for (int i = 0; i < qtdTestes; i++) {
				String nome = input.next();
				System.out.println("Y");
			}

		input.close();
		
	}
	
}