package 인터페이스;

public interface Person {
	
	// 인터페이스는 프로젝트가 시작될때
	// 필요한 기능들을 미리 정의하고 시작하는 기능! --> 추상클래스보다 먼저 만들어지는 최초의 설계도
	
	// 인터페이스 역시 객체 생성이 불가능하다!
	
	// 변수 -> 상수 값만 올 수 있다!
	final int eyes = 2; //생략됨 public static final
	// 메소드 -> 추상 메소드만 올 수 있다!
	public abstract void sleep();//생략 --> public abstract 생략가능!
	// 객체 생성 초기화
	//생성자 또한 메소드이기에, 호출과 정의로 나뉜다.
	//생성자와 일반 메소드와의 차이는 리턴 타입의 유무다.
	
	
	
	
	
	
	
	
	
}
