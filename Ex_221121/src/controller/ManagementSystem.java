package controller;

import model.MemberDAO;
import model.MemberDTO;

public class ManagementSystem {

	MemberDAO dao = new MemberDAO();
	MemberDTO dto = null;
	int cnt = 0;
	public void loginCon(String id, String pw) {
		
		boolean result = dao.login(id,pw);
		
		if(result == true) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
	public void insertCon(String id , String pw, String nick, int age) {
		
		
		dto = new MemberDTO(id, pw, nick, age);
		cnt = dao.insert(dto);
		if(cnt > 0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
	}
}
