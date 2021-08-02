package week06;

import java.util.Scanner;

public class bj4880_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String num = sc.next();
			String[] arr = new String[3];
			arr = num.split(" ");
			int a1 = Integer.parseInt(arr[0]);
			int a2 = Integer.parseInt(arr[1]);
			int a3 = Integer.parseInt(arr[2]);
			
			if(a1 == 0 && a2 == 0 && a3 == 0) {
				break;
			}
			
			if(a1 + a3 / 2 == a2) {
				System.out.println("AP" + (2*a2 - a1));
			}
			
			else if(a2 * a2 == a1 * a3) {
				System.out.println("GP" + (a2 * a2 / a1));
			}		
		}

	}

}
