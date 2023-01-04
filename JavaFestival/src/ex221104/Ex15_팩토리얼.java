package ex221104;

import java.util.Scanner;

public class Ex15_팩토리얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	      System.out.print("입력 : ");
	      int num = sc.nextInt();
	      int num1 = 1;
	      for (int i = 1; i <= num ; i++) {
	         
	         num1 = num1*i;
	      }
	      System.out.println("출력 : " + num1);
	}

}
