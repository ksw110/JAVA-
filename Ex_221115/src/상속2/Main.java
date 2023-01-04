package 상속2;

public class Main {

	public static void main(String[] args) {

		전화 phone = new 전화();
		스마트폰 smart = new 스마트폰();
		아이폰 iphone = new 아이폰();
		phone.call();
		phone.callback();
		
		smart.call();
		smart.callback();
		smart.explorer();
		smart.music();
		
		iphone.call();
		iphone.callback();
		iphone.explorer();
		iphone.music();
		iphone.camera();
	}

}
