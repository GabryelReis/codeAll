import java.util.Scanner;

public class URI1020{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int input, dia, mes, ano, restAno;

    input = sc.nextInt();

    ano = input/365;

    restAno = input % 365;

    mes = restAno / 30;

    dia = restAno % 30;

    System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",ano, mes, dia);

    sc.close();
  }
}
