import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			
			String acao = input.nextLine();
			
			if (acao.equals("esquerda")) {
				System.out.println("ingles");
			} else if (acao.equals("direita")) {
				System.out.println("frances");
			} else if (acao.equals("nenhuma")) {
				System.out.println("portugues");
			} else {
				System.out.println("caiu");
			}
			
		}
		
		input.close();

	}
	
}