
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			while (input.hasNext()) {
				int qtdVotos = input.nextInt();
				double qtdVotosFavoraveis = 0.0;
				for (int i = 0; i < qtdVotos; i++) {
					qtdVotosFavoraveis += input.nextInt();
				}
				if (qtdVotosFavoraveis / qtdVotos >= 2/3.0) {
					System.out.println("impeachment");
				} else {
					System.out.println("acusacao arquivada");
				}
			}

		input.close();

	}
	
}