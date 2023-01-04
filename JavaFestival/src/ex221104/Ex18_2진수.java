package ex221104;

import java.util.Scanner;

public class Ex18_2진수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >>");
		int num = sc.nextInt();
		String num2Str = Integer.toString(num, 2); //2진수
		String num3Str = Integer.toString(num, 3); //3진수
		String num8Str = Integer.toString(num, 8); //8진수
		String num16Str = Integer.toString(num, 16); //16진수
		
		System.out.println(num2Str);
		System.out.println(num3Str);
		System.out.println(num8Str);
		System.out.println(num16Str);
		
		
		
	}

}
