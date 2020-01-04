import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int valor = input.nextInt();
			System.out.println(valor - 1);
		}
		
		input.close();

	}
	
}