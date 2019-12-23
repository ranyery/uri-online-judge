import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		
		while (A != 0) {
			int B = input.nextInt();
			int C = input.nextInt();
			int areaCasa = A * B;
			double areaTerreno = areaCasa * (100.0 / C);
			System.out.println((int) Math.sqrt(areaTerreno));
			A = input.nextInt();
		}
		
		input.close();
		
	}
	
}

/*
 * A porcentagem total do terreno deve ser double
 * para não haver arredondamento quando ocorrer a
 * divisão de (100.0 / C).
 * 
 * Considere A = 50, B = 30, C = 89;
 * 
 * Cenário 1 (int):
 * A * B = 1500;
 * 100 / C = 1;
 * 1500 * 1 = 1500;
 * (int) sqrt(1500) = 38
 * 
 * Cenário 2 (double):
 * A * B = 1500;
 * 100.0 / C = 1.1235955056179776;
 * 1500 * 1.1235955056179776 = 1685.3932584269664;
 * (int) sqrt(1685.3932584269664) = 41;
 * 
 */