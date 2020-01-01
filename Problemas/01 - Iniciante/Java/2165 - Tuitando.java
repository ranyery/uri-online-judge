
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			String texto = input.nextLine();
			
			int qtdCaracteres = texto.length();
			if (qtdCaracteres <= 140) {
				System.out.println("TWEET");
			} else {
				System.out.println("MUTE");
			}

		input.close();

	}
	
}