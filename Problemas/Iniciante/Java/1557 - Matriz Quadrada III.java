import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		while (valor != 0) {
			int[][] matriz = new int[valor][valor];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i + j == matriz.length - 1) {
						matriz[i][j] = (int) Math.pow(2, i + j);
					} else if (i == 0) {
						matriz[i][j] = (int) Math.pow(2, j);
					} else {
						matriz[i][j] = matriz[i - 1][j] * 2;
					}
				}
			}
			
			String auxDigitos = Integer.toString(matriz[valor - 1][valor - 1]);
			int aux = auxDigitos.length() + 1;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (j == 0) {
						System.out.printf("%" + (aux - 1) + "d", matriz[i][j]);
					} else {
						System.out.printf("%" + aux + "d", matriz[i][j]);
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