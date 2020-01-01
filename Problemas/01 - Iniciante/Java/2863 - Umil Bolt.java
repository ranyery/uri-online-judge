
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
			while (input.hasNext()) {
				int qtdValores = input.nextInt();
				double menorVelocidade = input.nextDouble();
				for (int i = 1; i < qtdValores; i++) {
					double valor = input.nextDouble();
					if (valor < menorVelocidade) {
						menorVelocidade = valor;
					}
				}
				System.out.println(menorVelocidade);
			}
			
		input.close();

	}
	
}