import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		int N = input.nextInt();
		
		System.out.println(text.substring(0,N));
		
		input.close();
		
	}
	
}