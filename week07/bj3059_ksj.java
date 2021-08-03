package week07;

import java.util.Scanner;

public class bj3059_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String alpArr[] = new String[26];
		StringBuilder sb = new StringBuilder();
		String stra = "";
		for(int i=0; i<alpArr.length; i++) {
			alpArr[i] = Character.toString((char)(65+i));
			stra = stra.concat(alpArr[i]);
		}
		for(int i=0; i<len; i++) {			
			int sum = 0;
			String str = sc.next();
			for(int j=0; j<26; j++) {
				if(!str.contains(alpArr[j])) {
					sum += stra.charAt(j);
				}
			}
			sb.append(sum)
			.append("\n");
		}
		System.out.println(sb);
	}

}
