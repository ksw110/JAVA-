package 실습;

import java.util.Scanner;

public class Ex02_실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		for (int i = num1  ; i <= num2 ; i++) {
			
			System.out.print(i+" ");
		}
		sc.close();

	}

}
