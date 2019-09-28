import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		System.out.printf("NUMBER = %d%n", idFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", horasTrabalhadas * valorHora);
		
		sc.close();
		
	}

}
