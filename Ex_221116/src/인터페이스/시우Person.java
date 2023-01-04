package 인터페이스;

public class 시우Person implements Person, Person2 {
	//implements -> 인터페이스 상속 받을때 쓰는 키워드
	//인터페이스 상속은 다중 상속이 가능하다!!
	
	@Override
	public void sleep() {
		System.out.println("엎드려서 잠을잔다.");
	}

	@Override
	public void eat() {
		System.out.println("먹는다");
	}
	
	
}
