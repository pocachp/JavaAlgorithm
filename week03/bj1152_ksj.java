package week03;

import java.util.Scanner;

public class bj1152_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().trim();
		String[] strArr = sentence.split(" ");
		int count = 0;
		
		for(int i=0; i<strArr.length; i++) {
			count++;
		}
		if(sentence == "") {
			System.out.println("0");
		}
		else {
			System.out.println(count);
		}
		
	}

}
