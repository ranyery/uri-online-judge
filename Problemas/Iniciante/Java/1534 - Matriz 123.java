import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			
			int valor = input.nextInt();
			int[][] matriz = new int[valor][valor];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i + j == matriz.length - 1) {
						matriz[i][j] = 2;
					} else if (i == j) {
						matriz[i][j] = 1;
					} else {
						matriz[i][j] = 3;
					}
				}
			}
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
			
		}
		
		input.close();
		
	}
	
}