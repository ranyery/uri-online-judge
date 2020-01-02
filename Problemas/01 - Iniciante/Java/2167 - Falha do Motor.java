import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		int[] velocidades = new int[qtdTestes];
		int indiceQuedaVelocidade = 0;
		
		for (int i = 0; i < qtdTestes; i++) {
			velocidades[i] = input.nextInt();
		}
		
		for (int i = 1; i < velocidades.length; i++) {
			if (velocidades[i] < velocidades[i - 1]) {
				indiceQuedaVelocidade = i + 1;
				break;
			}
		}
		
		System.out.println(indiceQuedaVelocidade);
		
		input.close();
		
	}
	
}