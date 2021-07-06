package week03;

import java.util.Scanner;

public class bj19698_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		int width = W/L;
		int height = H/L;
		int mul = width * height;
		if(mul > N) {
			System.out.println(N);
		}else {
		System.out.println(mul);
	}
	}

}
