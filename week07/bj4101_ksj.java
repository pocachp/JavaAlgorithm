package week07;

import java.util.Scanner;
import java.math.BigInteger;

public class bj4101_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();
			BigInteger bigNum = new BigInteger("0");
			

			if (A.compareTo(bigNum) == 0 && B.compareTo(bigNum) == 0) {
				break;
			} 
			else if (A.compareTo(B) == -1) {
				System.out.println("No");
			} else if (A.compareTo(B) == 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}

}
