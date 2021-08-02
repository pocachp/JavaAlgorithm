package week07;

import java.util.Scanner;

public class bj20362_ksj {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int len = sc.nextInt();
      String S = sc.next();
      int count = 0;
      String[][] arr = new String[len][2];
      String rightAnswer = "";
      int index = 0;
      
      for(int i=0; i<arr.length; i++) {
    	  for(int j= 0; j<arr[i].length; j++) {
    		  arr[i][j] = sc.next();
    		  if(arr[i][0].equals(S)) {
    			 rightAnswer = arr[i][1];
    			 index = i;
    		  }
    	
    	  }
      }
      for(int i = 0; i < index; i++) {
    	  if(rightAnswer.equals(arr[i][1])) {
    		  count++;
    	  }
      }
      System.out.println(count);

   }

}