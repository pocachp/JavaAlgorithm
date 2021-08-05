package week07;

import java.util.Scanner;

public class bj4458_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			String firstLetter = str.substring(0,1);
			String rest = str.substring(1);
						
			sb.append(firstLetter.toUpperCase() + rest)
			.append("\n");
		}
		System.out.println(sb);

	}

}
