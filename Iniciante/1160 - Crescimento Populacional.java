import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		int contador = 0;
		
		while (contador < qtdTestes) {
			
			int PA = input.nextInt();
			int PB = input.nextInt();
			double txPA = input.nextDouble();
			double txPB = input.nextDouble();
			int qtdAnos = 0;
			
			while (PA <= PB) {
				PA += (int) PA * (txPA/100);
				PB += (int) PB * (txPB/100);
				qtdAnos++;
				if (qtdAnos > 100) {
					break;
				}
			}
			
			if (qtdAnos > 100) {
				System.out.println("Mais de 1 seculo.");
			} 
			else {
				System.out.printf("%d anos.%n", qtdAnos);
			}
			
			contador++;
			
		}
		
		input.close();
		
	}
}