import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double salarioInformado = sc.nextDouble();
		sc.close();
		
		double percentualReajuste;
		double salarioReajustado;
		
		if (salarioInformado <= 400.0) {
			percentualReajuste = 1.15;
			salarioReajustado = salarioInformado * percentualReajuste;
		} else if (salarioInformado <= 800.0) {
			percentualReajuste = 1.12;
			salarioReajustado = salarioInformado * percentualReajuste;
		} else if (salarioInformado <= 1200.0) {
			percentualReajuste = 1.10;
			salarioReajustado = salarioInformado * percentualReajuste;
		} else if (salarioInformado <= 2000.0) {
			percentualReajuste = 1.07;
			salarioReajustado = salarioInformado * percentualReajuste;
		} else {
			percentualReajuste = 1.04;
			salarioReajustado = salarioInformado * percentualReajuste;
		}
		
		System.out.printf("Novo salario: %.2f%n", salarioReajustado);
		System.out.printf("Reajuste ganho: %.2f%n", salarioReajustado - salarioInformado);
		System.out.printf("Em percentual: %.0f %%%n", (percentualReajuste - 1) * 100);
		
	}

}
