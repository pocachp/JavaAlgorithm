package week08;

import java.util.Scanner;

public class bj12605_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < len; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			System.out.print("Case #" + (i + 1) + ": ");
			for (int j = strArr.length-1; j >= 0; j--) {
				System.out.print(strArr[j] + " ");
			}
			System.out.println();

		}

	}

}
