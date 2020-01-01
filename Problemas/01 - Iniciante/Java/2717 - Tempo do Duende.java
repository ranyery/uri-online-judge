
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			int qtdMinutosRestantes = input.nextInt();
			int A = input.nextInt();
			int B = input.nextInt();
			
			if ((A + B) > qtdMinutosRestantes) {
				System.out.println("Deixa para amanha!");
			} else {
				System.out.println("Farei hoje!");
			}
			
		input.close();

	}
	
}