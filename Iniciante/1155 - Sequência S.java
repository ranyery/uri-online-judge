public class Main {

	public static void main(String[] args) {
		
		double S = 0;
		
		for (int i = 1; i <= 100; i++) {
			S += (double) 1 / i;
		}
		
		System.out.printf("%.2f%n", S);

	}
}
