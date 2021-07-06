package week03;

import java.util.Scanner;

public class bj10179_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for(int i=0; i<len; i++) {
			double price = sc.nextDouble() * 0.8;
			System.out.println("$" + String.format("%.2f", price));
		}

	}

}
