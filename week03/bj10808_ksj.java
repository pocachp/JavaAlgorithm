package week03;

import java.util.Arrays;
import java.util.Scanner;

public class bj10808_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[26];
		int[] cntArr = new int[26];

		for (int i = 0; i < cntArr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = (char) (97 + i);
				for (int k = 0; k < str.length(); k++) {
					if (arr[j] == str.charAt(k)) {
						cntArr[i]++;
					}
				}
			}
			System.out.print(cntArr[i]/26 + " ");
		}

	}
}
