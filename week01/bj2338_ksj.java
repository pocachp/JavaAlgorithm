package week01;

import java.util.Scanner;
import java.math.BigInteger;


//10진수로 1000자리면 어마어마한 큰 수 (int로는 불가)
// 따라서 BigInteger 사용!

public class bj2338_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
				
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));

	}

}
