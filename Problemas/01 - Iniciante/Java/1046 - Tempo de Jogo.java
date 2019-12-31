import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracaoTotal;
		
		if (horaInicial > horaFinal) {
			duracaoTotal = 24 - horaInicial + horaFinal;
		} else if (horaFinal > horaInicial) {
			duracaoTotal = horaFinal - horaInicial;
		} else {
			duracaoTotal = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoTotal);
		
		sc.close();

	}

}
