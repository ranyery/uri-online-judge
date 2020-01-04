import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int horarioSaida = input.nextInt();
		int tempoViagem = input.nextInt();
		int fusoHorario = input.nextInt();
		
		int horarioChegada = (horarioSaida + tempoViagem + fusoHorario) % 24;
		
		if (horarioChegada < 0) {
			System.out.println(24 + horarioChegada);
		} else if (horarioChegada == 24) {
			System.out.println(0);
		} else {
			System.out.println(horarioChegada);
		}
		
		input.close();

	}
	
}