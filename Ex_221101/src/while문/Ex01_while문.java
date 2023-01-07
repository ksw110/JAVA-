package while문;

import java.util.Scanner;

public class Ex01_while문 {

	public static void main(String[] args) {

		//정수 입력받기
		Scanner sc= new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 입력 : ");
			
			int num = sc.nextInt();
			
			if (num > 10) {
				System.out.println("종료되었습니다.");
				break;
			}sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
