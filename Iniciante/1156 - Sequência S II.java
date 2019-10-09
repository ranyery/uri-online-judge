public class Main {

	public static void main(String[] args) {

		double S = 0;

		for (int i = 0, j = 1; j <= 39; i++, j += 2) {
			S += (double) j / Math.pow(2, i);
		}

		System.out.printf("%.2f%n", S);

	}
}
