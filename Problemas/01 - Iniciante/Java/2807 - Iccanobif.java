import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for (int i = N; i > 1; i--) {
			int valor = (int) ((Math.pow((1 + Math.sqrt(5)) / 2, i) - Math.pow((1 - Math.sqrt(5)) / 2, i)) / Math.sqrt(5));
			System.out.print(valor + " ");
		}
		
		int x = (int) ((Math.pow((1 + Math.sqrt(5)) / 2, 1) - Math.pow((1 - Math.sqrt(5)) / 2, 1)) / Math.sqrt(5));
		System.out.println(x);
		
		input.close();
		
	}
	
}