import java.util.Scanner;
import java.util.Locale;

public class URI1002{
		public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			double area, raio, pi;
			
			pi = 3.14159;
			
			raio = sc.nextDouble();
			
			area = pi * Math.pow(raio,2.0);
			
			System.out.printf("A=%.4f%n", area);
			
			sc.close();
			
		}
}
