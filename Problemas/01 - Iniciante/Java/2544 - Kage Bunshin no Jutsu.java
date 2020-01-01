
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			while (input.hasNext()) {
				int N = input.nextInt();
				int qtdNinjas = (int) (Math.log10(N) / Math.log10(2));
				System.out.println(qtdNinjas);
			}

		input.close();

	}
	
}