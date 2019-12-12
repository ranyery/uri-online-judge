import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		for (int i = 1; i <= qtdTestes; i++) {
			
			String escolhaSheldon = input.next();
			String escolhaRaj = input.next();
			
			if (escolhaSheldon.equals(escolhaRaj)) {
				System.out.printf("Caso #%d: De novo!%n", i);
			} else {
				switch (escolhaSheldon) {
				case "papel":
					if (escolhaRaj.equals("pedra") || escolhaRaj.equals("Spock")) {
						System.out.printf("Caso #%d: Bazinga!%n", i);
					} else {
						System.out.printf("Caso #%d: Raj trapaceou!%n", i);
					}
					break;
				case "pedra":
					if (escolhaRaj.equals("lagarto") || escolhaRaj.equals("tesoura")) {
						System.out.printf("Caso #%d: Bazinga!%n", i);
					} else {
						System.out.printf("Caso #%d: Raj trapaceou!%n", i);
					}
					break;
				case "lagarto":
					if (escolhaRaj.equals("Spock") || escolhaRaj.equals("papel")) {
						System.out.printf("Caso #%d: Bazinga!%n", i);
					} else {
						System.out.printf("Caso #%d: Raj trapaceou!%n", i);
					}
					break;
				case "tesoura":
					if (escolhaRaj.equals("lagarto") || escolhaRaj.equals("papel")) {
						System.out.printf("Caso #%d: Bazinga!%n", i);
					} else {
						System.out.printf("Caso #%d: Raj trapaceou!%n", i);
					}
					break;
				case "Spock":
					if (escolhaRaj.equals("tesoura") || escolhaRaj.equals("pedra")) {
						System.out.printf("Caso #%d: Bazinga!%n", i);
					} else {
						System.out.printf("Caso #%d: Raj trapaceou!%n", i);
					}
					break;
				}
			}
			
		}
		
		input.close();
		
	}
}