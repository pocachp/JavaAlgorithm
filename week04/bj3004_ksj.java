package week04;

import java.util.Scanner;

public class bj3004_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chessBoardCutNumber = sc.nextInt();
		double N = Math.floor(chessBoardCutNumber/2);
		double M = chessBoardCutNumber - N;
		int result = ((int)Math.round(N)+1) * ((int)Math.round(M)+1);
		System.out.println(result);
	}

}
