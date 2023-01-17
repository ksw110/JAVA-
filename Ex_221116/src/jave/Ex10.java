package jave;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[8];
		int b = arr[0];
		int c = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] =rd.nextInt(20);
			
		}
		System.out.println("배열에 있는 모든 값 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] > b) {
				b = arr[i];
			}
			if(arr[i] < c) {
				c= arr[i];
			}
		}
		System.out.println();
		System.out.print("가장큰 값 : " + b);
		System.out.println();
		System.out.print("가장 작은 값 : " + c);
		
	}

}
