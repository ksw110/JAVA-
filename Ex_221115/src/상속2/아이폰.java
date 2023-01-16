package 상속2;

public class 아이폰 extends 스마트폰 {

	public void camera() {
		System.out.println("화질 굳~");
	}
	
	// 오버라이딩(재정의)
	// 타입 매소드이름 매개변수 전부 같아야함
	// 매개변수 가 뭔지 모르면 @Override를 쓰면 에러로 알수있음
	@Override
	public void call() {
		System.out.println("특별한 전화걸기~");
	}
}
