package jave;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int t = sc.nextInt();
		int money;
		if(t > 8) {
			t = t - 8;
			money = t*5000 +40000;
		}else {
			money = t*5000;
		}
		System.out.println("총 임금은 " + money + "원 입니다.");
	}

}
