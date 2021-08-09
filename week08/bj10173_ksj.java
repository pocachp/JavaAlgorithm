package week08;

import java.util.Scanner;

public class bj10173_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String sentence = sc.nextLine();
			
			if (sentence.equals("EOI")) {
				break;
			}

			if (sentence.toUpperCase().contains("nemo".toUpperCase())) {
				sb.append("Found")
				.append("\n");
			} else {
				sb.append("Missing")
				.append("\n");
			}

		}
		System.out.println(sb);

	}

}
