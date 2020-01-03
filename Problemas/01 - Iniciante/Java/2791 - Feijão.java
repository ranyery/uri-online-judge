import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
				int indiceCopo = 0;
			
				for (int i = 1; i <= 4; i++) {
					int valor = input.nextInt();
					if (valor == 1) {
						indiceCopo = i;
					}
				}
				
				System.out.println(indiceCopo);
			
			input.close();
		
	}
	
}