package ex01_1111;

public class Person_main {

	public static void main(String[] args) {
		
		// Person 설계도 클래스를 이용해서 실제 사람(객체)이 만들어지는 클래스
		
		// 1. 사람(객체) 생성하기
		int a = 5;
		String b = "?";
		//데이터타입 person임 만든거임
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("siwoo",25,200);
		System.out.println(p3.name);
		
		
		p1.name = "김시우";
		p1.age = 29;
		p1.height = 175;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		p1.name = "킴시우";
		System.out.println(p1.name);
		p2.name = "진행시켜";
		p2.age = 20;
		p2.height = 170;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		
		p1.coading();
		p1.think();
		p2.coading();
		p2.think();
		
		
		
	}

}
