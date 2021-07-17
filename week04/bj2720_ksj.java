package week04;

//브론즈3 실패 -> 성공
// 다른 방법을 써야할 거 같음

import java.util.Scanner;

public class bj2720_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		
		for(int i=0; i<len; i++) {
			int change = sc.nextInt();
			
			double quarter = Math.floor(change / 25);
			double dime = Math.floor(change%25/10);
			double nickel = Math.floor(change%25%10/5);
			double penny =  Math.floor(change%25%10%5);
			
			int intquarter = (int) Math.floor(change / 25);
			int intdime = (int) Math.floor(change%25/10);
			int intnickel = (int) Math.floor(change%25%10/5);
			int intpenny = (int) Math.floor(change%25%10%5);
			
			System.out.println(intquarter + " " + intdime + " " + intnickel + " " + intpenny);
			
			
	
		}

	}

}
