import java.util.Scanner;

public class URI1003{
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			int SOMA, A, B;
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			SOMA = A+B;
			
			System.out.printf("SOMA = %d%n", SOMA);
			
			sc.close();
		}
}
