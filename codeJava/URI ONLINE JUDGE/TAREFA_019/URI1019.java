import java.util.Scanner;

public class URI1019{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int input, h, restH, min, seg;

    input = sc.nextInt();

    h = input / 3600;

    restH = input % 3600;

    min = restH / 60;

    seg = input % 60; 

    System.out.printf("%d:%d:%d%n", h, min, seg);

  }
}
