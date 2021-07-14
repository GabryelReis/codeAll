import java.util.Locale;
import java.util.Scanner;

public class URI1008{
		public static void main(String[] args){
				
				Locale.setDefault(Locale.US);
				
				Scanner sc = new Scanner(System.in);
				
				int numFunc, qntHoras;
				double valHora, salario;
				
				numFunc = sc.nextInt();
				qntHoras = sc.nextInt();
				valHora = sc.nextDouble();
				
				salario = qntHoras*valHora;
				
				System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",numFunc, salario);
		}
}
