package week03;

import java.util.Scanner;

public class bj5596_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] minScore = new int[4];
		int[] manScore = new int[4];
		int minSum = 0;
		int manSum = 0;
		
		for(int i=0; i<minScore.length; i++) {
			minScore[i] = sc.nextInt();
			minSum += minScore[i];
		}
		for(int i=0; i<manScore.length; i++) {
			manScore[i] = sc.nextInt();
			manSum += manScore[i];
		}
		
		if(minSum > manSum) {
			System.out.println(minSum);
		}
		else if(minSum == manSum) {
			System.out.println(minSum);
		}
		else {
			System.out.println(manSum);
		}
	}

}
