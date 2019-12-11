import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdHo = input.nextInt();
		
		for (int i = 1; i < qtdHo; i++) {
			System.out.print("Ho ");
		}
		
		System.out.println("Ho!");
		
		input.close();
		
	}
	
}