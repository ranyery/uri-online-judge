
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			String frase = input.nextLine();
			System.out.println(frase.split(",")[0]);
			System.out.println(frase.split(",")[1]);

		input.close();

	}
	
}