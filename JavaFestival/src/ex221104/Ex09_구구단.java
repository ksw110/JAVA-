package ex221104;

import java.util.Scanner;

public class Ex09_구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("단수입력 : ");
	      int num1 = sc.nextInt();
	      System.out.print("어느 수까지 추력 : ");
	      int num2 = sc.nextInt();
	      
	      for(int i = 1 ; i <= num2 ; i ++) {
	         System.out.printf("%d %s %d %s %d%n",num1," * ",i," = ",num1*i);
	         
	         
	         
	      }
	}

}
