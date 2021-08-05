package week07;

import java.util.Scanner;
import java.util.ArrayList;

public class bj5363_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");

			String temp = strArr[0];

			for (int j = 0; j < strArr.length; j++) {
				list.add(strArr[j]);
				list.remove(temp);
				list.add(temp);
			}

			temp = list.get(0);
			list.remove(temp);
			list.add(temp);

			String result = String.join(" ", list);
			sb.append(result).append("\n");

			list.clear();

		}
		System.out.println(sb);

	}

}