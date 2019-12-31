import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pularApos = sc.nextInt();
		int valorMaximo = sc.nextInt();
		int nAuxiliar = 1;

		while (nAuxiliar <= valorMaximo) {
			for (int i = 0; i < pularApos; i++) {
				System.out.print(nAuxiliar);
				if (nAuxiliar % pularApos == 0) {
					nAuxiliar++;
				} 
				else {
					System.out.print(" ");
					nAuxiliar++;
				}
			}
			System.out.printf("%n");
		}

		sc.close();

	}
}
