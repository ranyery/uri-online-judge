import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int contador = 0;
		
		while (contador != 6) {
			if (num % 2 == 1) {
				contador++;
				System.out.println(num);
				num++;
			} else {
				num++;
			}
		}
		
		sc.close();

	}

}
