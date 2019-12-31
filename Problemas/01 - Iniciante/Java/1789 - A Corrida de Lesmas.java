import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int qtdLesmas = input.nextInt();
			int[] lesmas = new int[qtdLesmas];
			
			for (int i = 0; i < lesmas.length; i++) {
				lesmas[i] = input.nextInt();
			}
			
			int maiorVelocidade = 0;
			
			for (int i = 0; i < lesmas.length; i++) {
				if (lesmas[i] > maiorVelocidade) {
					maiorVelocidade = lesmas[i];
				}
			}
			
			if (maiorVelocidade < 10) {
				System.out.println(1);
			} else if (maiorVelocidade < 20) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
		
		input.close();
		
	}
	
}