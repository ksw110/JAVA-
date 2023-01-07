package while문;

import java.util.Scanner;

public class Ex05_do_while문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print(">");
			num =sc.nextInt();
		}while(num != 0);
		System.out.println("프로그램 종료");
		sc.close();	}

}
