
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			long N = input.nextLong();
			long L = input.nextLong();
			long P = N * L;
			System.out.println(P);
		
		input.close();

	}
	
}