import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		while (valor != 0) {
			int[][] matriz = new int[valor][valor];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i == j) {
						matriz[i][j] = 1;
					} else if (j > i) {
						matriz[i][j] = matriz[i][j - 1] + 1;
					} else {
						matriz[i][j] = matriz[i - 1][j] + 1;
					}
				}
			}
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (j == 0) {
						System.out.printf("%3d", matriz[i][j]);
					} else {
						System.out.printf("%4d", matriz[i][j]);
					}
				}
				System.out.println();
			}
			
			valor = input.nextInt();
			System.out.println();
			
		}
		
		input.close();

	}

}
