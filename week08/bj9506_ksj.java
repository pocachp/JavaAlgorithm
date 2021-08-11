package week08;

import java.util.Scanner;
import java.util.ArrayList;

public class bj9506_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int num = sc.nextInt();
			int sum = 0;
			if (num == -1) {
				break;
			}

			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			if (sum == num) {
				System.out.print(num + " = 1");
				for (int i = 1; i < list.size(); i++) {
					System.out.print(" + " + list.get(i));
				}
				System.out.println();
				
			} else {
				System.out.println(num + " is NOT perfect.");
			}
		}
	}

}
