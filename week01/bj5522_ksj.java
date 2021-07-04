package week01;

import java.util.Scanner;

public class bj5522_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
	
		for(int i =0; i<5; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum);
	}

}
