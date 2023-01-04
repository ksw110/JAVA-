package ex221104;

import java.util.Scanner;

public class Ex04_다이어트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int cnt = 0;
		System.out.print("현재 몸무게 : ");
		a=sc.nextInt();
		System.out.print("목표 몸무게 : ");
		b=sc.nextInt();
		do {
			System.out.print(++cnt+"주차 감량몸무게 : ");
			c = sc.nextInt();
			a -= c;
			
		}while(a > b);
			System.out.println(a+"kg달성 축하합니다!");
			
		}
		
	}


