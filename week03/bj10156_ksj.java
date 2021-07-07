package week03;

import java.util.Scanner;

public class bj10156_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int count = sc.nextInt();
		int haveMoney = sc.nextInt();
		int result = price*count - haveMoney;
		
		if(price*count < haveMoney) {
			System.out.println(0);
		}
		else {
			System.out.println(result);
		}

	}

}
