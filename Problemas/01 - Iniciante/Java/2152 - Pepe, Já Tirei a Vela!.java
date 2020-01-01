
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int qtdEntradas = input.nextInt();
		
		for (int i = 0; i < qtdEntradas; i++) {
			String H = input.next();
			String M = input.next();
			String O = input.next();
			
			if (H.length() < 2) {
				H = "0" + H;
			}
			if (M.length() < 2) {
				M = "0" + M;
			}
			
			if (O.equals("1")) {
				O = "abriu";
			} else {
				O = "fechou";
			}
			
			String ocorrencia = H + ":" + M + " - A porta " + O + "!";
			
			System.out.println(ocorrencia);
		}

		input.close();

	}
	
}