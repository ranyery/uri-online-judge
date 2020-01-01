
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			while (input.hasNext()) {
				
				int qtdVisitantes = input.nextInt();
				int alturaMinima = input.nextInt();
				int alturaMaxima = input.nextInt();
				
				int totalVisitantesPermitidos = 0;
				
				for (int i = 0; i < qtdVisitantes; i++) {
					int altura = input.nextInt();
					if (altura >= alturaMinima && altura <= alturaMaxima) {
						totalVisitantesPermitidos++;
					}
				}
				
				System.out.println(totalVisitantesPermitidos);
				
			}
			
		input.close();

	}
	
}