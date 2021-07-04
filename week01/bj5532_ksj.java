package week01;

import java.util.Scanner;

public class bj5532_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr[0]; i++) {
			arr[1] -= arr[3];
			arr[2] -= arr[4];
			
			if(arr[1] <=0 && arr[2] <=0) {
				System.out.println(arr[0]-i-1);
				break;
			}
		}
		

			
		
	}

}
