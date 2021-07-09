package week03;

import java.util.Scanner;

public class bj5717_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int male = sc.nextInt();
			int female = sc.nextInt();
			
			if(male == 0 && female == 0) {
				break;
			}
			
			int sum = male + female;
			System.out.println(sum);
		}
	}

}
