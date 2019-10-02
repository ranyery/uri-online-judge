import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = 0;
		int A = 0, B = 0;

		if (num1 > num2) {
			A = num2;
			B = num1;
		} else {
			A = num1;
			B = num2;
		}

		while (A < B && A != B ) {
			A++;
			if ((A % 2 == 1 || A % 2 == -1) && A != B) {
				soma += A;
			}
		}

		System.out.println(soma);

		sc.close();

	}

}
