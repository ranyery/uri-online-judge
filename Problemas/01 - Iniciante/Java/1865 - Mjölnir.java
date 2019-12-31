import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			
			String nome = input.next();
			int forca = input.nextInt();
			
			if (nome.equals("Thor")) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			
		}
		
		input.close();
		
	}
	
}