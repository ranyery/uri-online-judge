import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		int qtdPontos = 0;
		
		if (distancia <= 800) {
			qtdPontos = 1;
		} else if (distancia <= 1400) {
			qtdPontos = 2;
		} else {
			qtdPontos = 3;
		}
		
		System.out.println(qtdPontos);
		
		input.close();

	}
	
}