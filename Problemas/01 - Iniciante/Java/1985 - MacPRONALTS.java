import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtdPedidos = input.nextInt();
		double valorTotal = 0.0;
		
		for (int i = 0; i < qtdPedidos; i++) {
			int idProduto = input.nextInt();
			int qtdProduto = input.nextInt();
			double valorPedido = 0.0;
			switch (idProduto) {
				case 1001:
					valorPedido = qtdProduto * 1.5;
					break;
				case 1002:
					valorPedido = qtdProduto * 2.5;
					break;
				case 1003:
					valorPedido = qtdProduto * 3.5;
					break;
				case 1004:
					valorPedido = qtdProduto * 4.5;
					break;
				default:
					valorPedido = qtdProduto * 5.5;
			}
			valorTotal += valorPedido;
		}
		
		System.out.printf("%.2f%n", valorTotal);
		
		input.close();

	}
	
}