import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x > 0) {
				if (y > 0) {
					System.out.println("primeiro");
				} 
				else if (y < 0) {
					System.out.println("quarto");
				} 
				else {
					break;
				}
			} 
			else {
				if (y > 0 && x != 0) {
					System.out.println("segundo");
				} 
				else if (y < 0 && x != 0) {
					System.out.println("terceiro");
				} 
				else {
					break;
				}
			}
		}
		
		sc.close();
		
	}
}
