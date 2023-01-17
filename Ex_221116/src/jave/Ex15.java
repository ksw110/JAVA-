package jave;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int num = 1;
		for(int i = 0 ; i <= n ; i++) {
			
			num +=i;
			System.out.print(num+" ");
		}
		
	}

}
