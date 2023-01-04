package 상속4;

public abstract class Snack {
	//추상 메소드를 가지기 위해서는 반듯이 클래스가 추상 클래스여야 한다.
	
	
	//abstract : 추상 -> 구현되어 있지않고 선언만 되어있는것 
	
	//eat 메소드에 강제성 부여!
	//추상메소드! : 내용이 구현되어 있지않은 메소드 
	//자식한테 구현할 수 있도록 강제성 부여!
	public abstract void eat(); 
}
