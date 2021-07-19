import java.util.Scanner;
import java.util.Locale;

//AVISO: Esse código ainda está incompleto!

/*
 * ENTRADA:
 * 
 * Dia 5
 * 08 : 12 : 23
 * Dia 9
 * 06 : 13 : 23
 * 
 * SAíDA:
 * 
 * 3 dia(s)
 * 22 hora(s)
 * 1 minuto(s)
 * 0 segundo(s)
*/

public class URI1061{
		public static void main(String[] args){
				
				Locale.setDefault(Locale.US);
				
				Scanner sc = new Scanner(System.in);
				
				int W1, X1, Y1, Z1, W2, X2, Y2, Z2, segundos;
				int DIAS, HORAS, MINS, SEGS;
				String str;
				
				System.out.printf("Dia ");
				W1 = sc.nextInt(); //dia começo
				X1 = sc.nextInt(); // horas
				sc.next(); // ler os :
				Y1 = sc.nextInt(); // minutos
				sc.next(); // ler os :
				Z1 = sc.nextInt(); //segundos
						
				System.out.printf("Dia ");
				W2 = sc.nextInt(); //dia final
				X2 = sc.nextInt(); //horas
				sc.next(); // ler os :
				Y2 = sc.nextInt(); // minutos
				sc.next(); // ler os :
				Z2 = sc.nextInt(); // segundos
				
				segundos = Z1 + Z2 + (Y1 * 60 + Y2 * 60) + (X1 * 3600 + X2 * 3600) + ((W2 - W1) * 86400);
						
				DIAS = segundos / 86400;
				HORAS = DIAS / 3600;
				MINS = HORAS / 60;
				SEGS = MINS % 60;
				
				System.out.printf("%n%d SEGUNDOS NO TOTAL.%n", segundos);
				
				System.out.printf("%d dia(s)%n", DIAS);
				System.out.printf("%d hora(s)%n", HORAS);
				System.out.printf("%d minuto(s)%n", MINS);
				System.out.printf("%d segundo(s)%n", SEGS);
						
				sc.close();
		}
}
