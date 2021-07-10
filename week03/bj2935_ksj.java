package week03;

import java.util.Scanner;
import java.math.BigInteger;

public class bj2935_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		String op = sc.next();
		BigInteger B = sc.nextBigInteger();
		
		if(op.equals("*")) {
			System.out.println(A.multiply(B));
		}
		else if(op.equals("+")) {
			System.out.println(A.add(B));
		}

	}

}
