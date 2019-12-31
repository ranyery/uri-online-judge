import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			
			int M = input.nextInt();
			int N = input.nextInt();
			
			long fatorialM = 1;
			long fatorialN = 1;
			
			while (M > 0) {
				fatorialM *= M;
				M--;
			}
			
			while (N > 0) {
				fatorialN *= N;
				N--;
			}
			
			long somaFatorial = fatorialM + fatorialN;
			
			System.out.println(somaFatorial);
			
		}
		
		input.close();
		
	}
	
}