import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdValores = input.nextInt();
		
		for (int i = 0; i < qtdValores; i++) {
			String question = input.nextLine();
			String answer = "I am Toorg!";
			System.out.println(answer);
		}
		
		input.close();
		
	}
	
}