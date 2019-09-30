import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codProduto = sc.nextInt();
		int qtdProduto = sc.nextInt();
		double valorProduto = 0.0;
		
		switch (codProduto) {
			case 1:
				valorProduto = 4.0;
				break;
			case 2:
				valorProduto = 4.5;
				break;
			case 3:
				valorProduto = 5.0;
				break;
			case 4:
				valorProduto = 2.0;
				break;
			case 5:
				valorProduto = 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", qtdProduto * valorProduto);
		
		sc.close();
		
	}

}
