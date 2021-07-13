package week04;

import java.util.Scanner;

public class bj2440_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		for(int i=0; i<len; i++) {
			for(int j=len; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
