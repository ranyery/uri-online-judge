public class Main {

	public static void main(String[] args) {
		
		int i = 1, j = 60;
		
		do {
			System.out.printf("I=%d J=%d%n", i, j);
			i += 3;
			j -= 5;
		} while (j >= 0); 
		
	}

}
