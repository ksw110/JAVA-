package ex01_1111;

public class Tv {

	int channel;
	String color;
	
	public void chnnelUp() {
		++channel;
	}
	public void chnnelDown() {
		--channel;
	}
	public void print() {
		System.out.println("Tv의 현재 채널은" + channel+"이고, Tv의 색깔은" + color+"입니다." );
	}









}