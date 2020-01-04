import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String letras = "";
		
		int indiceFelicidade = input.nextInt();
		
		for (int i = 0; i < indiceFelicidade; i++) {
			letras += "a";
		}
		
		System.out.println("Feliz nat" + letras + "l!");
		
		input.close();

	}
	
}