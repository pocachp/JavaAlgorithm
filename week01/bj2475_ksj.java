package week01;

import java.util.Scanner;

//브론즈5 확정

public class bj2475_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			sum += Math.pow(num, 2);
		}
		System.out.println(sum % 10);
	}
}
