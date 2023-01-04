package q6;

public class Restaurant extends Store {

	@Override
	public double grade() {
		return (service + clean + price) / 3;
		// 서비스, 맛, 청결, 가격 점수의 평균을 출력할 메소드 소수점 2자리 수 까지만 출력
	}

	double service; // 서비스 점수를 저장할 필드
	double flavor; // 맛 점수를 저장할 필드
	double clean; // 청결 점수를 저장할 필드

	public Restaurant(String name, String event, double price, double service, double clean) {
//		객체 생성시 가게들의 정보를 입력받는 생성자
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.clean = clean;
	}
}