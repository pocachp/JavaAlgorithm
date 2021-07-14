package week04;

import java.util.Scanner;

public class bj2921_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += i*(i+1)/2;
		}
		System.out.println(3 * sum);

	}

}
