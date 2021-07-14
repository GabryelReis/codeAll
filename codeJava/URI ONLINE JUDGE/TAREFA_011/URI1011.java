import java.util.Scanner;
import java.util.Locale;

public class URI1011{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, pi, volume;

        //Math.pow e Math.sqrt

        pi = 3.14159;

        raio = sc.nextDouble();

        volume = (4.0/3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}