import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = 0;
		
		do {
			n2 = input.nextInt();
		} while (n1 >= n2);
		
		int soma = n1;
		int i = 1;
		
		while (soma < n2) {
			soma += n1 + i;
			i++;
		}

		System.out.println(i);
		
		input.close();

	}
}
