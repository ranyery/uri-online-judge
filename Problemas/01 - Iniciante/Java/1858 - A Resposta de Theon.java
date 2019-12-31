import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] T = new int[N];
		
		for (int i = 0; i < T.length; i++) {
			T[i] = input.nextInt();
		}
		
		int qtdAtqs = T[0];
		int index = 0;
		
		for (int i = 0; i < T.length; i++) {
			if (T[i] < qtdAtqs) {
				qtdAtqs = T[i];
				index = i;
			}
		}
		
		System.out.println(index + 1);
		
		input.close();
		
	}
	
}