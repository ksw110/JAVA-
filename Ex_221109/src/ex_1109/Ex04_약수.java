package ex_1109;

import java.util.Scanner;

public class Ex04_약수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수입력 >> ");
		int num2 = sc.nextInt();
		boolean result = isDivisor(num1, num2);
		System.out.print(result);
		
	}
	public static boolean isDivisor(int num1, int num2) {
		
		if(num1 % num2 == 0 ) {
			return true;
		}else {
			return false;
		}
		
	}

}
