package week02;

import java.util.Scanner;

public class bj2908_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String rev1 = "";
		for(int i=str1.length()-1; i>=0; i--) {
			rev1 += str1.charAt(i);
		}
		String rev2 = "";
		for(int i=str2.length()-1; i>=0; i--) {
			rev2 += str2.charAt(i);
		}
		
		int num1 = Integer.parseInt(rev1);
		int num2 = Integer.parseInt(rev2);
		if(num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
			
	}
}
