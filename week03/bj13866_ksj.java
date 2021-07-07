package week03;

import java.util.Arrays;
import java.util.Scanner;

public class bj13866_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int first = arr[0] + arr[3];
		int second = arr[1] + arr[2];

		if (first > second) {
			System.out.println(first - second);
		} else if (first == second) {
			System.out.println(0);
		} else {
			System.out.println(second - first);
		}

	}

}
