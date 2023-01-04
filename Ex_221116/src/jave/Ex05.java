package jave;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for(int k = 1; k <= i ; k ++) {
				
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
