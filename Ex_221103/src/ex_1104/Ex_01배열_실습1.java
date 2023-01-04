package ex_1104;

import java.util.Scanner;

public class Ex_01배열_실습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		 for (int i = 0; i < array.length; i++) {
	         System.out.print(i + 1 + "번째 입력 : ");
	         array[i] = sc.nextInt();
		 }
		System.out.print("입력된 점수 : ");
		int max = array[0];
		int min = array[0];
		int k = array[0];
		for (int i = 0; i < array.length; i++) {

			k = k + array[i];

			if (max < array[i]) {
				max = array[i];
			}
			System.out.print(array[i] + " ");

		}
		System.out.println();
		System.out.println("최고 점수 : " + max);
		for (int i = 0; i < array.length; i++)
			if (min > array[i]) {
				min = array[i];
			}
		System.out.println("최소 점수 : " + min);
		System.out.println("점수 총합 : " + k);
		System.out.println("점수 평균 : " + (double)k / array.length);

	}

}
