import java.util.Scanner;
import java.util.Locale;

public class URI1016{
	public static void main(String[] args){

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int X;

		X = sc.nextInt();

		System.out.printf("%d minutos%n",X*2);

		sc.close();
	}
}
