import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			
			int N = input.nextInt();
			int[][] matriz = new int[N][N];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					boolean coreI = false;
					boolean coreJ = false;
					if (N % 3 == 0) {
						coreI = i >= N/3 && i < (int)(N * (2/3.0));
						coreJ = j >= N/3 && j < (int)(N * (2/3.0));
					} else {
						coreI = i >= (int)(N/3.0) && i <= (int)(N/3.0*2);
						coreJ = j >= (int)(N/3.0) && j <= (int)(N/3.0*2);
					}
					
					if (coreI && coreJ) {
						matriz[i][j] = 1;
					} else if (i == j) {
						matriz[i][j] = 2;
					} else if (i + j == matriz.length -1) {
						matriz[i][j] = 3;
					} else {
						matriz[i][j] = 0;
					}
				}
			}
			
			matriz[N/2][N/2] = 4;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
			
			System.out.println();
			
		}
		
		input.close();
		
	}
	
}