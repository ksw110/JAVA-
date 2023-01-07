package while문;

import java.util.Scanner;

public class Ex03_while문3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0; // 짝수 카운트
		int b = 0; // 홀수 카운트
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (num == - 1) {
				System.out.println("종료되었습니다.");
				break;
			} else if (num % 2 == 0) {
				a++;
			} else if (num % 2 == 1){
				b++;
			}
			System.out.println("홀수개수 : " + a);
			System.out.println("짝수개수 : " + b);

		}sc.close();

	}
}
