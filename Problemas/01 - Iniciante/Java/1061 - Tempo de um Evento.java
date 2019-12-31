import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str;
		int diaInicio, diaFim;
		int horaInicio, minutoInicio, segundoInicio;
		int horaFim, minutoFim, segundoFim;
		
		int minuto = 60;
		int hora = 3600;
		int dia = 86400;
		
		str = sc.next();
		diaInicio = sc.nextInt();
		horaInicio = sc.nextInt();
		str = sc.next();
		minutoInicio = sc.nextInt();
		str = sc.next();
		segundoInicio = sc.nextInt();
		
		str = sc.next();
		diaFim = sc.nextInt();
		horaFim = sc.nextInt();
		str = sc.next();
		minutoFim = sc.nextInt();
		str = sc.next();
		segundoFim = sc.nextInt();
		
		int diaInicioSegundos = (horaInicio * hora) + (minutoInicio * minuto) + segundoInicio;
		int diaFimSegundos = (horaFim * hora) + (minutoFim * minuto) + segundoFim;
		int duracaoSegundos = ((diaFim - diaInicio) * dia) - diaInicioSegundos + diaFimSegundos;
		
		System.out.printf("%d dia(s)%n", duracaoSegundos / dia);
		duracaoSegundos = duracaoSegundos % dia;
		System.out.printf("%d hora(s)%n", duracaoSegundos / hora);
		duracaoSegundos = duracaoSegundos % hora;
		System.out.printf("%d minuto(s)%n", duracaoSegundos / minuto);
		duracaoSegundos = duracaoSegundos % minuto;
		System.out.printf("%d segundo(s)%n", duracaoSegundos);
		
		sc.close();
		
	}

}
