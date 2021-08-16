package week09;

import java.util.Scanner;
import java.util.ArrayList;

public class bj4592_ksj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = "";
		while (true) {
			int len = sc.nextInt();
			if (len == 0) {
				break;
			}
			
			ArrayList<String> list = new ArrayList<String>();
			
			for (int i = 0; i < len; i++) {
				 list.add(sc.next());
				 if(i > 0) {
					 if(list.get(i-1).equals(list.get(i))) {
						 temp = list.get(i);
						 list.remove(i);
						 list.add(i,"");
					 }else if(temp.equals(list.get(i))) {
						 list.remove(i);
						 list.add(i,"");
					 }else {
						 temp ="";
					 }
				 }
				 if(!list.get(i).equals("")) {
				 System.out.print(list.get(i) +" ");
				 }
			}
			System.out.println("$");
			
			

		}
		
	}

}
