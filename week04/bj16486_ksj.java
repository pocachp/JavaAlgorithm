package week04;

import java.util.Scanner;

public class bj16486_ksj {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int d1 = sc.nextInt();
    int d2 = sc.nextInt();

    double square = d1 * 2;
    double circle = d2 * 2 * 3.141592;
    double result = square + circle;

    System.out.println(result);
  }
}
