package week03;

import java.util.Scanner;

public class bj2460_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int max = 0;
		
		for(int i=0; i<10; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			result += (in - out);
			if(max < result) {
				max = result;
			}
		}
		System.out.println(max);

	}

}
