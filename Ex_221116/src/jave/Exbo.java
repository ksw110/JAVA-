package jave;

import java.util.Scanner;

public class Exbo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(i+1 +"번째 수 입력 : ");
			arr[i] = sc.nextInt();
			
		}System.out.println("정렬 후");
		for(int i = 4; i >= 0 ; i--) {
			System.out.print(arr[i] + " ");
			
			
		}
	}

}
