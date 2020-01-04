import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String valor = input.next();
		String valorInvertido = "";
		
		for (int i = valor.length(); i > 0; i--) {
			valorInvertido += valor.charAt(i - 1);
		}
		
		System.out.println(valorInvertido);
		
		input.close();

	}
	
}