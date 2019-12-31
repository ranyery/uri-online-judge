import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			
			int valor = input.nextInt();
			
			if (valor == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
			
		}
		
		input.close();
		
	}
	
}