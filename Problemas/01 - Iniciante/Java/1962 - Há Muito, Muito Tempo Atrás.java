import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdDatas = input.nextInt();
		
		for (int i = 0; i < qtdDatas; i++) {
			int data = input.nextInt();
			if (data >= 2015) {
				System.out.println(data - 2015 + 1 + " A.C.");
			} else {
				System.out.println((data - 2015) * -1 + " D.C.");
			}
		}
		
		input.close();

	}
	
}