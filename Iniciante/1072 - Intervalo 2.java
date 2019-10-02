import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros = sc.nextInt();
		int num = 0;
		int contador = 0;
		int dentroIntervalo = 0;
		int foraIntervalo = 0;
		
		while (contador < qtdNumeros) {
			num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
			contador++;
		}

		System.out.printf("%d in%n", dentroIntervalo);
		System.out.printf("%d out%n", foraIntervalo);

		sc.close();

	}

}
