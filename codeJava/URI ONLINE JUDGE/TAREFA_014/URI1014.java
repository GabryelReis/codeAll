import java.util.Scanner;
import java.util.Locale;

public class URI1014{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double X, Y, Z;

        X = sc.nextDouble();
        Y = sc.nextDouble();
        
        Z = X/Y;

        System.out.printf("%.3f km/l%n",Z);

        sc.close();
    }
}