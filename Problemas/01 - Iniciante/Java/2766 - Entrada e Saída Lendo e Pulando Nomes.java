import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = input.next();
		}
		
		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);
		
		input.close();

	}
	
}