import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; num != 0; i++) {
			if (i != num) {
				System.out.print(i + " ");
				continue;
			}
			System.out.println(num);
			num = sc.nextInt();
			i = 0;
		}

		sc.close();

	}
}