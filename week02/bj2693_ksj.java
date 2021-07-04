package week02;

import java.util.Arrays;
import java.util.Scanner;

public class bj2693_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		StringBuilder sb = new StringBuilder();
	
		int N = 3;
		for(int i=0; i<len; i++) {
			int[] arr = new int[10];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			System.out.println(arr[arr.length-N]);
		}
	}
}
