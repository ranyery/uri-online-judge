import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double diferenca = 0;
		double IR = 0;
		
		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario <= 3000) {
			IR = 0.08;
			diferenca = salario - 2000;
			IR = diferenca * IR;
			System.out.printf("R$ %.2f%n", IR);
		} else if (salario <= 4500) {
			IR = 0.18;
			diferenca = salario - 3000;
			IR = (diferenca * IR) + (1000 * 0.08);
			System.out.printf("R$ %.2f%n", IR);
		} else {
			IR = 0.28;
			diferenca = salario - 4500;
			IR = (diferenca * IR) + (1500 * 0.18) + (1000 * 0.08);
			System.out.printf("R$ %.2f%n", IR);
		}
		
		sc.close();
		
	}

}
