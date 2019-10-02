import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int index = 0;
		
		for (int i = 1; i <= 100; i++) {
			int num = sc.nextInt();
			if (num > maior) {
				maior = num;
				index = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(index);
		
		sc.close();
		
	}

}
