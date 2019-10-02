import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int totalHoras = 0;
		int totalMinutos = 0;
		
		if (horaInicial > horaFinal) {
			if (minutoInicial > minutoFinal) {
				totalHoras = 23 - (horaInicial - horaFinal);
				totalMinutos = 60 - (minutoInicial - minutoFinal); 
			} 
			else if (minutoInicial < minutoFinal) {
				totalHoras = 24 - (horaInicial - horaFinal); 
				totalMinutos = minutoFinal - minutoInicial; 
			} 
			else {
				totalHoras = 24 - (horaInicial - horaFinal); 
				totalMinutos = 0;
			}
		} 
		else if (horaInicial < horaFinal) {
			if (minutoInicial > minutoFinal) {
				totalHoras = 0;
				totalMinutos = 60 - (minutoInicial - minutoFinal);
			} 
			else if (minutoInicial < minutoFinal) {
				totalHoras = horaFinal - horaInicial;
				totalMinutos = minutoFinal - minutoInicial;
			} 
			else {
				totalHoras = horaFinal - horaInicial;
				totalMinutos = 0;
			}
		} 
		else {
			if (minutoInicial > minutoFinal) {
				totalHoras = 23;
				totalMinutos = 60 - (minutoInicial - minutoFinal);
			} 
			else if (minutoInicial < minutoFinal) {
				totalHoras = 0;
				totalMinutos = minutoFinal - minutoInicial;
			} 
			else {
				totalHoras = 24;
				totalMinutos = 0;
			}
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalHoras, totalMinutos);
		
		sc.close();
				
	}

}
