import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] tomadas = new int[4];
		int qtdEntradas = 0;
		
		for (int i = 0; i < tomadas.length; i++) {
			tomadas[i] = input.nextInt();
			qtdEntradas += tomadas[i];
		}
		
		qtdEntradas -= 3;
		
		System.out.println(qtdEntradas);
		
		input.close();
		
	}
	
}
