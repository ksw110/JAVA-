package 복습;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user1 : ");
		String user2 = sc.next();
		System.out.print("user1" + "님>>");
		String a = sc.next();
		System.out.print("user2" + "님>>");
		String b = sc.next();
		
		if (a.equals("보") && b.equals("가위")) {
			System.out.println(user2 +"님 승리!");
			
		}else if (a.equals("가위") && b.equals("보")) {
			System.out.println(user1 +"님 승리!");
			
		}else if (a.equals("가위") && b.equals("주먹")) {
			System.out.println(user2 +"님 승리!");
			
		}else if (a.equals("주먹") && b.equals("주먹")) {
			System.out.println("무승부!");
		
		}else if (a.equals("보") && b.equals("보")) {
			System.out.println("무승부!");		
		
		}else if (a.equals("가위") && b.equals("가위")) {
			System.out.println("무승부!");		
		
		}else if (a.equals("주먹") && b.equals("가위")) {
			System.out.println(user1 +"님 승리!");
			
		}else if (a.equals("주먹") && b.equals("보")) {
			System.out.println(user2 +"님 승리!");
			
		}else if (a.equals("보") && b.equals("주먹")) {
			System.out.println(user1 +"님 승리!");
			
		}else if (a.equals("보") && b.equals("가위")) {
			System.out.println(user2 +"님 승리!");
			
		}

	}

}
