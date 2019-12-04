import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTrianguloRetangulo = (a * c) / 2;
		double areaCirculo = pi * Math.pow(c, 2);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);	
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);	
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);	
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);	
		
		sc.close();
		
	}

}
