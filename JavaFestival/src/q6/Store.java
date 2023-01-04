package q6;

public abstract class Store {

	// 필드
	String name; // 가게 상호를 저장
	String event; // 가게 종목을 저장
	double price; // 가게 평점 중 가격 점수를 저장

	// 각 가게들의 점수의 평균을 출력할 메소드 (추상메소드)
	public abstract double grade();

	public void println() {
		int num = 1;
		System.out.println(num++ + name + ".\t" + "평점 : " + price);
	}

}
