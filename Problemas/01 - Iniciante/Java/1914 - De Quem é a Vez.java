import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdTestes = input.nextInt();
		
		for (int i = 0; i < qtdTestes; i++) {
			String nomeJ1 = input.next();
			String escolhaJ1 = input.next();
			String nomeJ2 = input.next();
			String escolhaJ2 = input.next();
			int numeroJ1 = input.nextInt();
			int numeroJ2 = input.nextInt();
			int soma = numeroJ1 + numeroJ2;
			if (soma % 2 == 0) {
				if (escolhaJ1.equals("PAR")) {
					System.out.println(nomeJ1);
				} else {
					System.out.println(nomeJ2);
				}
			} else {
				if (escolhaJ1.equals("IMPAR")) {
					System.out.println(nomeJ1);
				} else {
					System.out.println(nomeJ2);
				}
			}
			
		}
		
		input.close();
		
	}
	
}