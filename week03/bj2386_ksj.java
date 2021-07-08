package week03;

import java.util.Scanner;

public class bj2386_ksj {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    while (true) {
      char ch = sc.next().charAt(0);
      String str = sc.nextLine();

      if (ch == '#') {
        break;
      }

      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        if (ch == str.toLowerCase().charAt(i)) {
          count++;
        }
      }
      System.out.println(ch + " " + count);
    }
  }
}
