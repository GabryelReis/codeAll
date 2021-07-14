import java.util.Scanner;
import java.util.Locale;

public class URI1005{
		public static void main(String[] args){
				
				Locale.setDefault(Locale.US);
				
				Scanner sc = new Scanner(System.in );
				
				double MEDIA, A, B;
				
				A = sc.nextDouble();
				B = sc.nextDouble();
				
				MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
				
				System.out.printf("MEDIA = %.5f%n", MEDIA);
				
				sc.close();
		}
}
