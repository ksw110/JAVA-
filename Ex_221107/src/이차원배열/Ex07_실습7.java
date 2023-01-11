package 이차원배열;

import java.util.Scanner;

public class Ex07_실습7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] answer = new int[3][5];
		answer[0][0] = 4;
		answer[0][1] = 5;
		answer[0][2] = 4;
		answer[0][3] = 1;
		answer[0][4] = 2;
		answer[2][0] = 10;
		answer[2][1] = 20;
		answer[2][2] = 30;
		answer[2][3] = 20;
		answer[2][4] = 20;
		System.out.print("1번째 답 >> ");
		answer[1][0] = sc.nextInt();
		System.out.print("2번째 답 >> ");
		answer[1][1] = sc.nextInt();
		System.out.print("3번째 답 >> ");
		answer[1][2] = sc.nextInt();
		System.out.print("4번째 답 >> ");
		answer[1][3] = sc.nextInt();
		System.out.print("5번째 답 >> ");
		answer[1][4] = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < answer[0].length; i++) {

			if (answer[0][i] == answer[1][i]) {
				System.out.print("O" + "\t");
				sum = sum + answer[2][i];
			} else if (answer[0][i] != answer[1][i]) {
				System.out.print("X" + "\t");
			}
		}
		System.out.println();
		System.out.println("총합 : " + sum + "점");

	}

}
