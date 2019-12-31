import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();
			String humor = "";
			
			if (A > B ) {
				if (B > C && B-C < A-B) {
					humor = ":)";
				} else if (B > C && A-B <= B-C) {
					humor = ":(";
				} else {
					humor = ":)";
				}
			} 
			else if (A < B) {
				if (B < C && C-B < B-A) {
					humor = ":(";
				} else if (B < C && B-A <= C-B) {
					humor = ":)";
				} else  {
					humor = ":(";
				}
			} 
			else if (A == B) {
				if (B < C) {
					humor = ":)";
				} else {
					humor = ":(";
				}
			}
			
			System.out.println(humor);
		
		input.close();
		
	}
}