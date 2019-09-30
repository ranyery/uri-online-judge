import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double A, B, C;
		
		if (x > y && x > z) {
			A = x;
			if (y >= z) {
				B = y;
				C = z;
			} else {
				B = z;
				C = y;
			}
		} else if (y > z) {
			A = y;
			if (z >= x) {
				B = z;
				C = x;
			} else {
				B = x;
				C = z;
			}
		} else {
			A = z;
			if (x >= y) {
				B = x;
				C = y;
			} else {
				B = y;
				C = x;
			}
		}
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();

	}

}
