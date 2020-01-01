
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] musicas = new String[]{"PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};

		int qtdEntradas = input.nextInt();
		
		for (int i = 0; i < qtdEntradas; i++) {
			int X = input.nextInt();
			int Y = input.nextInt();
			int indice = X + Y;
			System.out.println(musicas[indice]);
		}
		
		input.close();

	}
	
}