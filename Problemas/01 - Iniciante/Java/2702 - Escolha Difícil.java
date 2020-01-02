import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdFrangoDisponivel = input.nextInt();
		int qtdBifeDisponivel = input.nextInt();
		int qtdMassaDisponivel = input.nextInt();
		
		int qtdFrangoPedido = input.nextInt();
		int qtdBifePedido = input.nextInt();
		int qtdMassaPedido = input.nextInt();
		
		int qtdPedidosNaoAtendidos = 0;
		
		if (qtdFrangoPedido > qtdFrangoDisponivel) {
			qtdPedidosNaoAtendidos += qtdFrangoPedido - qtdFrangoDisponivel;
		}
		if (qtdBifePedido > qtdBifeDisponivel) {
			qtdPedidosNaoAtendidos += qtdBifePedido - qtdBifeDisponivel;
		}
		if (qtdMassaPedido > qtdMassaDisponivel) {
			qtdPedidosNaoAtendidos += qtdMassaPedido - qtdMassaDisponivel;
		}
		
		System.out.println(qtdPedidosNaoAtendidos);
		
		input.close();
		
	}
	
}