package week04;

import java.util.Scanner;

public class bj4504_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mul = sc.nextInt();
		
		while(true) {
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			
			if(num%mul == 0) {
				System.out.println(num + " is a multiple of " + mul + ".");
			}
			else {
				System.out.println(num + " is NOT a multiple of " + mul + ".");
			}
		}
	}

}
