package ex_1109;

import java.util.Scanner;

public class Ex01_큰수확인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 >> ");
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		
		System.out.println("큰 수 확인 >> " + result );
	}
	public static int largerNumbers(int a, int b) {
		int result = 0;
		
		if(a > b) {
			 result = a;
		}else if(a < b) {
			 result = b;
		}else {
			 result = 0;
		}
		
		return result;
		
	} //리턴은 한번만 쓸 수 있으나 조건문으로 입력했기때문에 결과는 리턴 한개임
	public static int largerNumbers1(int a, int b) {

		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}

	}

}
