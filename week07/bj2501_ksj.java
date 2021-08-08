package week07;

import java.util.Scanner;
import java.util.ArrayList;

public class bj2501_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			if(N%i == 0) {				
				list.add(i);
				count ++;
			}
		}
		if(count < K) {
			System.out.println(0);
		}
		else {			
			System.out.println(list.get(K-1));
		}

	}

}
