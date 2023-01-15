package ex01_1111;

public class Tv_main {

	public static void main(String[] args) {

		Tv t = new Tv();
		
		t.channel = 7;
		t.color = "red";
		t.chnnelDown();
		t.print();
		t.chnnelDown();
		t.color = "black";
		t.print();
		t.chnnelUp();
		t.print();
	}

}
