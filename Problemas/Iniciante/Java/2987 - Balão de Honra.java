import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		char letra = input.next().charAt(0);
		
		for (int i = 0; i < alfabeto.length; i++) {
			if (alfabeto[i] == letra) {
				System.out.println(i + 1);
				break;
			}
		}
		
		input.close();

	}

}
