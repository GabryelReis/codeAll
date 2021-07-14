import java.util.Scanner;
import java.util.Locale;

public class URI1010{
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codePiece1, codePiece2, numPiece1, numPiece2;
		double valPiece1, valPiece2, formula;
		
		codePiece1 = sc.nextInt();
		numPiece1 = sc.nextInt();
		valPiece1 = sc.nextDouble();
		
		codePiece2 = sc.nextInt();
		numPiece2 = sc.nextInt();
		valPiece2 = sc.nextDouble();
		
		formula = (numPiece1 * valPiece1) + (numPiece2 * valPiece2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", formula);
		
		sc.close();
	}
}
