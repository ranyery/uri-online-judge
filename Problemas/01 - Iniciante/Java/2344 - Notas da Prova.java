import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nota = input.nextInt();
		char conceito;
		
		if (nota == 0) {
			conceito = 'E';
		} else if (nota <= 35) {
			conceito = 'D';
		} else if (nota <= 60) {
			conceito = 'C';
		} else if (nota <= 85) {
			conceito = 'B';
		} else {
			conceito = 'A';
		}
		
		System.out.println(conceito);
		
		input.close();
		
	}
	
}