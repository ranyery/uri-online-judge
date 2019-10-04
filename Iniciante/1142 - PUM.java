import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int registros = sc.nextInt();

		for (int i = 1, j = 1; j <= registros; i += 2, j++) {
			System.out.printf("%d", i);
			System.out.print(" ");
			System.out.printf("%d", ++i);
			System.out.print(" ");
			System.out.printf("%d", ++i);
			System.out.print(" ");
			System.out.println("PUM");
		}

		sc.close();

	}

}
