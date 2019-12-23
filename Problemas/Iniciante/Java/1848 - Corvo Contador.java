import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtdGritos = 0;
		int valor = 0;
		
		while (qtdGritos < 3) {
			String acao = new String(input.nextLine());
			if (acao.equals("caw caw")) {
				System.out.println(valor);
				qtdGritos++;
				valor = 0;
				continue;
			} else if (acao.equals("--*")) {
				valor += 1;
			} else if (acao.equals("-*-")) {
				valor += 2;
			}  else if (acao.equals("-**")) {
				valor += 3;
			} else if (acao.equals("*--")) {
				valor += 4;
			} else if (acao.equals("*-*")) {
				valor += 5;
			} else if (acao.equals("**-")) {
				valor += 6;
			} else if (acao.equals("***")) {
				valor += 7;
			}
		}
		
		input.close();
		
	}
}