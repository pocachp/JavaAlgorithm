package week07;

import java.util.Scanner;

public class bj1264_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] strArr = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' };
		while (true) {
			int cnt = 0;
			String str = sc.nextLine();
			if (str.equals("#")) {
				break;
			}
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < strArr.length; j++) {
					if (str.charAt(i) == strArr[j]) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

}
