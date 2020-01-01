
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
			int qtdAlunos = input.nextInt();
			int[] idAlunos = new int[qtdAlunos];
			double maiorNota = 0;
			int index = 0;
			
			for (int i = 0; i < idAlunos.length; i++) {
				idAlunos[i] = input.nextInt();
				double nota = input.nextDouble();
				if (nota > maiorNota) {
					maiorNota = nota;
					index = i;
				}
			}
			
			if (maiorNota >= 8.0) {
				System.out.println(idAlunos[index]);
			} else {
				System.out.println("Minimum note not reached");
			}

		input.close();

	}
	
}