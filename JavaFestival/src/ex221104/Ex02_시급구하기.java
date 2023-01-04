package ex221104;

import java.util.Scanner;

public class Ex02_시급구하기 {

	public static void main(String[] args) {

//		일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
//		시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
//		1.5배의 시급이 책정됩니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = (time - 8) * 7500 + 40000 ;
		
		if (time <= 8) {
			System.out.println(time * 5000);
		}else {
			System.out.println("총임금은 "+ money + "원 입니다.");
			
		}
			
		
		
		
		
		
		
		
		
	}

}
