package week02;
//브론즈2

import java.util.Arrays;
import java.util.Scanner;

public class bj2577_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A*B*C;
		
		String str = Integer.toString(mul);
		
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j) - '0') == i){
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}

