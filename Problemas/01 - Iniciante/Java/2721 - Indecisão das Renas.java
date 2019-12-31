import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] renas = new String[]{"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
		
		int[] qtdBolas = new int[9];
		int totalBolas = 0;
		
		for (int i = 0; i < qtdBolas.length; i++) {
			qtdBolas[i] = input.nextInt();
			totalBolas += qtdBolas[i];
		}
		
		int index = totalBolas % 9;
		
		if (index == 0) {
			System.out.println(renas[8]);
		} else {
			System.out.println(renas[index - 1]);
		}
		
		input.close();

	}
	
}