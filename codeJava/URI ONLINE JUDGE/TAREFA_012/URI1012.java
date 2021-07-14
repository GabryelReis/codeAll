import java.util.Scanner;
import java.util.Locale;

public class URI1012{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTri, areaCir, areaTra, areaQua, areaRec, pi;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        pi = 3.14159;

        areaTri = (A*C)/2.0;
        areaCir = pi * Math.pow(C, 2);
        areaTra = ((A+B)*C) / 2;
        areaQua = B*B;
        areaRec = A*B;

        System.out.printf("TRIANGULO: %.3f%n", areaTri);
        System.out.printf("CIRCULO: %.3f%n", areaCir);
        System.out.printf("TRAPEZIO: %.3f%n", areaTra);
        System.out.printf("QUADRADO: %.3f%n", areaQua);
        System.out.printf("RETANGULO: %.3f%n", areaRec);

        sc.close();
    }
}