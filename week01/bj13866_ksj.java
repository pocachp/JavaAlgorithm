package week01;

import java.util.Scanner;

public class bj13866_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		int scoresSum1 = scores[0] + scores[3];
		int scoresSum2 = scores[2] + scores[4];
		int sub = scoresSum1 - scoresSum2;
		System.out.println(sub);
		
	}

}
