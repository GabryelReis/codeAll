import java.util.Locale;
import java.util.Scanner;

public class URI1009{
		public static void main(String[] args){
				
				Locale.setDefault(Locale.US);
				
				Scanner sc = new Scanner(System.in);
					
				// total = (totalVendas*0.15)+salFix
				
				String nome;
				double salFix, totalVendas, totalBrut;
				
				nome = sc.next();
				salFix = sc.nextDouble();
				totalVendas = sc.nextDouble();
				
				totalBrut = (totalVendas*0.15)+salFix;
				
				System.out.printf("TOTAL = R$ %.2f%n", totalBrut);
		
		
		}
}
