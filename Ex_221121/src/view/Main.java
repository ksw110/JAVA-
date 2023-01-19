package view;

import java.util.Scanner;

import controller.ManagementSystem;
//import controller.ManagementSystem;
import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		MemberDTO dto = null;
		MemberDAO dao = new MemberDAO();
		ManagementSystem ms = new ManagementSystem();
		// 어떤 화면을 구성할 것인가
		System.out.println("====인공지능====");

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 로그인
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				ms.loginCon(id, pw);
			} else if (menu == 2) {
				// 회원가입
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				ms.insertCon(id, pw, nick, age);
		
		
		
	}

}
	}}
