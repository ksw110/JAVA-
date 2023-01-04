package 반복문;

import java.util.Scanner;

public class Ex03_if_else문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 정수 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.print(num + "는(은) 홀수입니다.");
		} else {
			System.out.print(num + "는(은) 짝수입니다.");
		}sc.close();
	}

}
