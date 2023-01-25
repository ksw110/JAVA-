package view;

import java.util.Scanner;

import javax.swing.JLabel;

import javazoom.jl.player.MP3Player;
import model.DAO;
import model.DTO;
import musiclist.musicMain;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		musicMain mm = new musicMain();
		int cnt = 0;
		DAO dao = new DAO();
		DTO dto = null;
		 JLabel label = new JLabel();
		 label.setHorizontalAlignment(JLabel.CENTER);
		try {
System.out.println("##    ## ##  ##  #### ##   ####     ####   ##   ######   #### ##  ## ##### #### ");
Thread.sleep(500);
System.out.println("###  ### ##  ## ##    ##  ##       ##      ##     ##    ##    ##  ## ##    ## ##");
Thread.sleep(500);
System.out.println("#### ### ##  ## ###   ## ##       ##      # ##    ##   ##     ##  ## ##    ## ## ");
Thread.sleep(500);
System.out.println("# ### ## ##  ##  ###  ## ##       ##      # ##    ##   ##     ###### ####  #### ");
Thread.sleep(500);
System.out.println("#  #  ## ##  ##   ### ## ##       ##     ######   ##   ##     ##  ## ##    ## ## ");
Thread.sleep(500);
System.out.println("#  #  ## ##  ##    ## ##  ##       ##    #   ##   ##    ##    ##  ## ##    ## ## ");
Thread.sleep(500);
System.out.println("#     ##  ####  ####  ##   ####     #### #   ##   ##     #### ##  ## ##### ##  ##");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");

while( true) {
	System.out.println("[1] 게임 시작하기");
	System.out.println("[2] 게임 설명  ");
	System.out.println("[3] 랭킹 확인  ");
	System.out.println("[4] 게임 종료");
	System.out.print("번호 입력 : ");
	int num=sc.nextInt();
	
	if(num==1) {
		System.out.print("[1]로그인 [2]회원가입 [3]정보수정 [4]회원탈퇴 [5]종료 >>");
	  int menu = sc.nextInt();
	   
	   
		   if(menu==1) {
				System.out.print("아이디 입력 >>");
				String id =sc.next();
				System.out.print("비밀번호 입력 >>");
				String pw =sc.next();
				boolean result = dao.login(id, pw);
				
				if(result == true) {
					System.out.println("로그인 성공");
					mm.main();
				}else {
					System.out.println("로그인 실패");
				}
				
		   }else if(menu==2) {
			   
			   System.out.print("아이디 입력 >>");
			   String id =sc.next();
			   System.out.print("비밀번호 입력 >>");
			   String pw =sc.next();
			   System.out.print("닉네임 입력 >>");
			   String nick =sc.next();
			   dto = new DTO(id,pw,nick);
			   dao.insert(dto);
		   }else if(menu==3) {
			   System.out.print("회원 ID : ");
			   String id = sc.next();
			   System.out.print("현재 PW : ");
			   String pw1 = sc.next();
			   System.out.print("변경할 PW : ");
			   String pw = sc.next();
			   dto = new DTO(id,pw,pw1);
			   dao.update(dto);
		   }else if(menu==4) {
			   System.out.print("ID : ");
			   String id = sc.next();
			   System.out.print("PW : ");
			   String pw = sc.next();
			   System.out.print("NICK : ");
			   String nick = sc.next();
			   dto = new DTO(id,pw,nick);
			   dao.delete(dto);
		   }else if(menu==5) {
			   System.out.println("프로그램 종료");
			   break;
		   }System.out.println();
		   
		   }else if(num==2) {
			   System.out.println();
			   System.out.println("짧은 시간에 전주를 듣고 60초안에 노래를 맞추는 게임! ");
			   System.out.println("난이도별로 전주시간이 다르고 패스와 힌트가 존재한다. ");
			   System.out.println();
			   System.out.println();
			   System.out.println();
		
		   }else if(num==3) {
			   
		   }else if(num==4) {
			   System.out.println("프로그램 종료");
			   break;
		   }System.out.println();
	
}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 

		
	}

}
