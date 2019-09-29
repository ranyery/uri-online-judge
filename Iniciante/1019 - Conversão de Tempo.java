import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valorSegundos = sc.nextInt();
		
		int hora = valorSegundos / 3600;
		valorSegundos %= 3600;
		int minutos = valorSegundos / 60;
		valorSegundos %= 60;
		
		System.out.printf("%d:%d:%d%n", hora, minutos, valorSegundos);
		
		sc.close();
		
	}

}
