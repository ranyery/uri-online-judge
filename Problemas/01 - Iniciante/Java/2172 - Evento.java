import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
				while (input.hasNext()) {
					int aumentoExp = input.nextInt();
					int experiencia = input.nextInt();
					if (aumentoExp != 0 && experiencia != 0) {
						System.out.println(aumentoExp * experiencia);
					} else {
						break;
					}
				}
			
			input.close();
		
	}
	
}