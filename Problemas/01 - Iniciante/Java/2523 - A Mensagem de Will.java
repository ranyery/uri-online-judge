import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			String texto = "";
			String frase = input.next();
			int qtdLetras = input.nextInt();
			for (int  i = 0; i < qtdLetras; i++) {
				int indice = input.nextInt();
				texto += frase.charAt(indice - 1);
			}
			System.out.println(texto);
		}
		
		input.close();

	}
	
}