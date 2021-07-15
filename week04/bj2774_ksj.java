package week04;

import java.util.Scanner;

public class bj2774_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			String str = sc.next();
			String result = "";
			for (int j = 0; j < str.length(); j++) {
				if(str.indexOf(str.charAt(j)) == j){
					result += str.charAt(j);
					cnt = result.length();
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}

	}

}
