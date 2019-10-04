import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int golsInter = 0, golsGremio = 0;
		int vitoriasInter = 0, vitoriasGremio = 0; 
		int totalGrenais = 0, totalEmpates = 0, novoJogo = 0;
		
		do {
			
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();
			totalGrenais++;
			
			if (golsInter > golsGremio) {
				vitoriasInter++;
			} else {
				vitoriasGremio++;
			}
			
			if (golsInter == golsGremio) {
				totalEmpates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoJogo = sc.nextInt();
			
		} while (novoJogo == 1);
		
		System.out.printf("%d grenais%n", totalGrenais);
		System.out.printf("Inter:%d%n", vitoriasInter);
		System.out.printf("Gremio:%d%n", vitoriasGremio);
		System.out.printf("Empates:%d%n", totalEmpates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else {
			System.out.println("Gremio venceu mais");
		}
		
		sc.close();

	}

}
