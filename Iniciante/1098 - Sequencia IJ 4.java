import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		for (float i = 0.f; i <= 2.1; i += 0.2) {
			for (float j = 1.f; j <= 3.0; j++) {
				
				int iCasting = (int) i;
				int jCasting = (int) j;
				
				if (i == iCasting) {
					if (j == jCasting) {
						System.out.printf("I=%d J=%d%n", iCasting, jCasting + iCasting);
					}
					else {
						System.out.printf("I=%d J=%.1f%n", iCasting, j + i);
					}
				}
				else if (j == jCasting) {
					if (i > 2.0) {
						System.out.printf("I=%d J=%.0f%n", iCasting, jCasting + i);
					} 
					else {
						System.out.printf("I=%.1f J=%.1f%n", i, (double) jCasting + i);
					}
				} 
				else {
					System.out.printf("I=%.1f J=%.1f%n", i, j + i);
				}
			}
		}
	}
}
