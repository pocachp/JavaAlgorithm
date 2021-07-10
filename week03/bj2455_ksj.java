package week03;

import java.util.Scanner;

public class bj2455_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			int firstRiding = (arr[1] - arr[2]) + arr[3];
			int secondRiding = (firstRiding - arr[4]) + arr[5];
			int thirdRiding = secondRiding -arr[6];
			
			int[] arr2 = {firstRiding, secondRiding, thirdRiding};
			for(int j =0; j<arr2.length; j++) {
				if(max < arr2[j]) {
					max = arr2[j];
				}
			}
		}
		System.out.println(max);
	}

}
