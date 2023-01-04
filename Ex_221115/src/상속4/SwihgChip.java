package 상속4;

public class SwihgChip extends Snack{

	@Override
	public void eat() {
		System.out.println("스윙칩 먹기");
	}
	
	//Snack 에서 물려준 eat 이란 기능을 반듯이!!!
	//오버라이딩(재정의) 해줘야만 합니다!!
//	public void eat() {
//		System.out.println("스윙칩 먹기");
//	}
}
