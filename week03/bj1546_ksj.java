package week03;

import java.util.Scanner;

public class bj1546_ksj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		double[] arr = new double[len];
		double max = 0;
		double sum = 0;
		
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]* 100) / max;
			sum += arr[i];
		}
		System.out.println(sum / len);
	}

}
