package ex_1109;

import java.util.Scanner;

public class Ex05_약수합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 >> ");
		int num1 = sc.nextInt();
		int result = getsum(num1);

		System.out.println(num1 + "의 약수의 합 : " + result);
		getDivisor(num1);
	}

	public static void getDivisor(int num1) {
		System.out.print(num1 + "의 약수 : ");
		for (int i = 1; i < num1; i++) {

			if (num1 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	public static int getsum(int num1) {
		
		int result = 0;
		for (int i = 1; i <= num1; i++) {
			
			if (num1 % i == 0) {
				result = result + i;
			}
		}
		return result;
	}


}