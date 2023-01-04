package ex01_1111;

import java.util.ArrayList;

public class Contact_main {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();

		
		// 객체 생성
		
//		Contact c1 = new Contact("김시우", 20, "010-7155-1111");
		contacts.add(new Contact("김시우", 20, "010-7155-1111"));
		contacts.add(new Contact("kimsiwoo", 24, "010-7155-2222"));
		contacts.add(new Contact("siwoo", 25, "010-7155-2222"));
		contacts.add(new Contact("kim", 26, "010-7155-3333"));
		
		
		for(int i = 0 ; i < contacts.size() ; i++) {
			String name = contacts.get(i).getName();
			int age = contacts.get(i).getAge();
			String tel = contacts.get(i).getTel();
			
			System.out.printf(i+1 + ". %s(%d) : %s%n",name,age,tel);
		}
//		String name = c1.getName();
//		int age = c1.getAge();
//		String tel = c1.getTel();
		
		// 김시우(20) : 010-7155-1111
		// %s = 문자열을 뜻함
		// %d = 정수를 뜻함
		// %n = ln을 뜻함
//		System.out.printf("%s(%d) : %s",name,age,tel);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
