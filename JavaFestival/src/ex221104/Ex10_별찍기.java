package ex221104;

import java.util.Scanner;

public class Ex10_별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("행 개수 : ");
	      int num1 = sc.nextInt();
	      for (int i = 1 ; i <= num1 ; i++) {
	         
	         for(int k = 1 ; k <= i ; k++) {
	            System.out.print("*");
	            
	         }
	         
	         System.out.println();
	         
	      }
	}

}
