package ex221104;

import java.util.Scanner;

public class Ex05_A_B_입력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

//		do {
//			System.out.print("A 입력 > ");
//			 num1 = sc.nextInt();
//			System.out.print("B 입력 > ");
//			 num2 = sc.nextInt();
//			 System.out.println("결과 >> " + (num1-num2));
//		}while(num1 != 0 && num2 != 0);
//		System.out.println("프로그램 종료");

		while (true) {
			System.out.print("A 입력 > ");
			num1 = sc.nextInt();
			System.out.print("B 입력 > ");
			num2 = sc.nextInt();
			System.out.println("결과 >> " + (num1 - num2));
			if (num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
