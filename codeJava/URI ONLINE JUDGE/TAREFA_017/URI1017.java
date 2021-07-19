import java.util.Scanner;
import java.util.Locale;

public class URI1017{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double X, Y, result;
        
        X = sc.nextInt();
        Y = sc.nextInt();

        result = (X*Y)/12;

        System.out.printf("%.3f%n",result);

        sc.close();
    }
}
