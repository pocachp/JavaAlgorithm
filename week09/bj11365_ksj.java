package week09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bj11365_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = sc.nextLine();
			if(str.equals("END")) {
				break;
			}
			String[] strArr = str.split("");
			List<String> list = Arrays.asList(strArr);
			Collections.reverse(list);
			
			String[] revArr = list.toArray(strArr);
			String revStr = String.join("",revArr);
			sb.append(revStr)
			.append("\n");
		}
		System.out.println(sb);

	}

}
