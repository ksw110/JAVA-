package 반복문;

import java.util.Scanner;

public class Ex02_단순if문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("성인입니다.");
		}sc.close();
	}

}
