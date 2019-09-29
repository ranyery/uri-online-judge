import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdAnos, qtdMeses, qtdDias;
		
		qtdDias = sc.nextInt();
		
		qtdAnos = qtdDias / 365;
		qtdDias %= 365;
		qtdMeses = qtdDias / 30;
		qtdDias %= 30;
		
		System.out.printf("%d ano(s)%n", qtdAnos);
		System.out.printf("%d mes(es)%n", qtdMeses);
		System.out.printf("%d dia(s)%n", qtdDias);
		
		sc.close();

	}

}
