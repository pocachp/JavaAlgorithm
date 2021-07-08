package week03;

import java.util.Arrays;
import java.util.Scanner;

public class bj11948_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[4];
		int[] arr2 = new int[2];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<arr1.length; i++) {
			sum1 = arr1[1] + arr1[2] + arr1[3];
		}
		for(int i=0; i<arr2.length; i++) {
			sum2 = arr2[1];
		}
		System.out.println(sum1 + sum2);
		
		

	}

}
