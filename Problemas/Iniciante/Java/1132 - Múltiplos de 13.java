import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int soma = 0;
		
		if (A <= B) {
			while (A <= B) {
				if (A % 13 != 0) {
					soma += A;
				}
				A++;
			}
			System.out.println(soma);
		} 
		else if (A >= B) {
			while (A >= B) {
				if (B % 13 != 0) {
					soma += B;
				}
				B++;
			}
			System.out.println(soma);
		} 
		else {
			System.out.println(soma);
		}

		sc.close();

	}

}
