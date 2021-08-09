package week08;

import java.util.Scanner;

public class bj2743_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int cnt = 0;
		for(int i=0; i<word.length(); i++) {
			cnt ++;
		}
		System.out.println(cnt);

	}

}
