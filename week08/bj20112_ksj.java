package week08;

import java.util.Scanner;

public class bj20112_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String[] str = new String[len];
		String[][] strArr = new String[len][len];
		
		for(int i=0; i<len; i++) {
			str[i] = sc.next();
			strArr[i] = str[i].split("");
		}
		
		int cnt = 0;
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				if(strArr[i][j].equals(strArr[j][i])) {
					cnt ++;
				}
			}
		}
		if(len == cnt/len) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}