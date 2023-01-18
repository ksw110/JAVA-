package view;

import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDTO dto = null;
		MemberDAO dao = new MemberDAO();
		
		// 어떤 화면을 구성할 것인가
		System.out.println("====인공지능====");
		
		
		while(true) {
			System.out.print("[1]로그인 [2]회원가입 [3]정보수정 [4]조회 [5]회원탈퇴 [6]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				// 로그인
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				
				boolean result = dao.login(id,pw);
				
				if(result == true) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else if (menu == 2) {
				// 회원가입
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				
				dto = new MemberDTO(id, pw, nick, age);
				int cnt = dao.insert(dto);
				if(cnt > 0) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
			}else if (menu == 3) {
				// 정보수정
				System.out.print("회원 ID : ");
				String id = sc.next();
				System.out.print("변경할 PW : ");
				String pw = sc.next();
				dto = new MemberDTO(id, pw);
				
				int cnt = dao.update(dto);
				
				if(cnt > 0) {
					System.out.println("회원정보 수정완료");
				}else {
					System.out.println("회원정보 수정실패");
				}
				
			}else if (menu == 4) {
				// 조회
				
			}else if (menu == 5) {
				// 회원탈퇴
				System.out.print("삭제할 ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				dto = new MemberDTO(id, pw);
				int cnt = dao.delete(dto);
				if(cnt > 0) {
					System.out.println("회원 탈퇴 성공");
				}else {
					System.out.println("회원 탈퇴 실패");
				}
			}else if (menu == 6) {
				// 종료
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("다시 입력해주세요~");
			}
		}
		
		
		
		
		
	}

}
