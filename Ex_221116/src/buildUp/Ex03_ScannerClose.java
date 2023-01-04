package buildUp;

import java.util.Scanner;

public class Ex03_ScannerClose {

	public static void main(String[] args) {
		Scanner sc;
		int a= 5;
		while(true) {
			
		// 에러발생
		sc = new Scanner(System.in);
		
		System.out.print("달러입력 : ");
		int input = sc.nextInt();
		if (input == -1) {
			break;
		}
		
		System.out.println(input * 1324 + "원입니다");
		}
		sc.close();
		
		
		
	}

}
