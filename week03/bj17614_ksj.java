package week03;

// 다시 풀어보자

import java.util.Scanner;

public class bj17614_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=N; i++) {
			String[] str = Integer.toString(i).split("");
			for(int j = 0; j < str.length; j++) {
				if(str[j].equals("3") || str[j].equals("6") || str[j].equals("9")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
