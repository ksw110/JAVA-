package while문;

import java.util.Scanner;

public class Ex08_실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		String id = "Hello";
		String pw = "1234";
		
				
		while(true) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String input_id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >> ");
			String input_pw = sc.next();
			if(input_id.equals(id) && input_pw.equals(pw)) {
				System.out.println("로그인 성공!");
				break;				
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				System.out.print("계속하시겠습니까? (Y/N)>>");
				String a = sc.next();
				if (a.equals("N")) {
					System.out.println("종료되었습니다.");
					break;
					
					}
				}
			}sc.close();
	}

	}
