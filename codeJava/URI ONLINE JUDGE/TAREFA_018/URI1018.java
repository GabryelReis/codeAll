import java.util.Scanner;

public class URI1018{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N, cem, cinquenta, vinte, dez, cinco, dois, um, rest100, rest50, rest20, rest10, rest5, rest2;

        N = sc.nextInt();
        
        System.out.printf("%d%n", N);

        cem = N / 100;
        System.out.printf("%d nota(s) de R$ 100,00%n", cem);

        rest100 = N % 100;
        cinquenta = rest100 / 50;
        System.out.printf("%d nota(s) de R$ 50,00%n", cinquenta);

        rest50 = rest100 % 50;
        vinte = rest50 / 20;
        
        System.out.printf("%d nota(s) de R$ 20,00%n", vinte);

        rest20 = rest50 % 20;
        dez = rest20 / 10;
        System.out.printf("%d nota(s) de R$ 10,00%n", dez);

        rest10 = rest20 % 10;
        cinco = rest20 / 5;
        System.out.printf("%d nota(s) de R$ 5,00%n", cinco);

        rest5 = rest10 % 5;
        dois = rest5 / 2;
        System.out.printf("%d nota(s) de R$ 2,00%n", dois);

        rest2 = rest5 % 2;
        um = rest2 / 1;
        System.out.printf("%d nota(s) de R$ 1,00%n", um);

        sc.close();
    }
}