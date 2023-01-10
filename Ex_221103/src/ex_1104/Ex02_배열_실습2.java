package ex_1104;

import java.util.Scanner;

public class Ex02_배열_실습2 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		String[] team = {"김시우","이현수","김준연","이도여","장예슬"};
		System.out.print("이름 : ");
		String name = sc.next();
		
		for (int i = 0 ; i < team.length ; i++ ) {
			
			if (name.equals(team[i])) {
				
				System.out.println(name+"님은 "+ i +"번 인덱스에 있습니다.");
				
				
			}
				
			
		}
		
		
		
		
		
		
		
	}

}
