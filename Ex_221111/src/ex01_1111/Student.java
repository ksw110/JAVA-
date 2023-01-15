package ex01_1111;

public class Student {

	
	String name;
	String number;
	int age;
	int score_Java ;
	int scoreWeb;
	int scoreAndroid;
	//생성자 메소드
	//this : 자기 자신의 객체, 현재 실행되는 메소드가 속한 객체
	public Student(String name, String number, int age, int score_Java, int scoreWeb, int scoreAndroid) {
		
		this.name = name;
		this.number = number;
		this.age = age;
		this.score_Java = score_Java;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.printf("[%s, %d%s]\n",number,age,"살");
		System.out.println(name+"님의 Java점수는"+score_Java+"점 입니다.");
		System.out.println(name+"님의 Web점수는" + scoreWeb+"점 입니다.");
		System.out.println(name+"님의 Android점수는" + scoreAndroid+"점 입니다.");
		System.out.println("===========================================");
	}
	
	
}
