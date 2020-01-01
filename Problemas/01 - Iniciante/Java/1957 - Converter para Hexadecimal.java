
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Integer valor = input.nextInt();
		String resultado = Integer.toHexString(valor).toUpperCase();
		System.out.println(resultado);

		input.close();

	}
	
}