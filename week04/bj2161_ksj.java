package week04;

import java.util.Scanner;
import java.util.ArrayList;

//2161 : 실패 => 코드 주석 달기

public class bj2161_ksj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //입력 객체 생성
		int num = sc.nextInt(); //입력 받기
		ArrayList<Integer> list = new ArrayList<>(); //배열 생성
		for (int i = 1; i <= num; i++) {
			list.add(i); //1부터 num까지 배열에 추가
		}

		for (int i = 0; i < num; i++) {
			if (i == num - 1) {
				System.out.println(list.remove(0)); //인덱스 0 지운거 출력
			} else {
				int temp = list.get(1); //인덱스 1 변수 temp에 가져와서
				list.add(temp); // temp 배열에 추가
				list.remove(1); // 다시 인덱스 1 삭제
				System.out.print(list.remove(0) + " "); // 출력
			}
		}

	}

}

/* 내가 쓴 코드 (실패)
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	ArrayList<Integer> arrList = new ArrayList<>();
	
	int[] arr = new int[num];
	for (int i = 1; i <= num; i++) {
		arrList.add(i);
	}
	for (int i = 0; i < arrList.size(); i++) {
			arrList.remove(i);
	}
	System.out.println(arrList);
*/