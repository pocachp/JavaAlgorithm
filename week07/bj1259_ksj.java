package week07;

import java.util.Scanner;

public class bj1259_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next().toString();
			
			StringBuffer sb = new StringBuffer(str);
			String reversedStr = sb.reverse().toString();
			
			if(str.equals("0")) {
				break;
			}
			
			else if(str.equals(reversedStr)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		

	}

}
