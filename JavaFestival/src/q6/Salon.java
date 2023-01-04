package q6;

public class Salon extends Store {

	@Override
	public double grade() {
		return (technology + kindness + price)/3;
//		기술, 친절, 가격 점수의 평균을 출력할 메소드 소수점 2자리 수 까지만 출력
	}

	double technology;
	double kindness;

	public Salon(String name, String event, double price, double technology, double kindness) {
//		객체 생성시 가게들의 정보를 입력받는 생성자
		this.name = name;
		this.event = event;
		this.price = price;
		this.technology = price;
		this.kindness = kindness;
	}

}
