
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			String nome = input.nextLine();
			int qtdCaracteres = nome.length();
			
			if (qtdCaracteres <= 80) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		input.close();

	}
	
}