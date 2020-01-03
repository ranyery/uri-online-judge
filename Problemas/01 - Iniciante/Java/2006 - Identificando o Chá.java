import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		int tipoCha = input.nextInt();
		int qtdRespostaCorretas = 0;
		
		for (int i = 0; i < 5; i++) {
			int resposta = input.nextInt();
			if (resposta == tipoCha) {
				qtdRespostaCorretas++;
			}
		}
		
		System.out.println(qtdRespostaCorretas);
				
		input.close();
		
	}
	
}