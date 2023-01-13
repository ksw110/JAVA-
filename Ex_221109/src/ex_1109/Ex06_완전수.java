package ex_1109;

import java.util.Scanner;

public class Ex06_완전수 {

	public static void main(String[] args) {

		// 완전수?
		// 약수를 나열 했을때 자기 자신 빼고 합이 자기 자신인 경우
		// 6 -> 1, 2, 3, 6(자기자신)
		Scanner sc = new Scanner(System.in);
		System.out.print("Star 정수입력 >> ");
		int startValue = sc.nextInt();
		System.out.print("End 정수입력 >> ");
		int endValue = sc.nextInt();
		getPerfectNumber(startValue, endValue);
		
	}
	public static void getPerfectNumber(int sv, int ev) {
		System.out.print(sv + " ~ " + ev + "까지의 완전수 : " );
		
		for(int i = sv; i <= ev ; i++) {
			
			int sum = 0;
			for(int k = 1 ; k < i ; k++) {
				
				if(i % k == 0) {
					sum += k;
				}
			}
			if(sum == i) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
