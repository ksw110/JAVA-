package 상속4;

public class SnackMain {

	public static void main(String[] args) {

		
		SunChip p1 = new SunChip();
		eat(p1);
		Honey p2 = new Honey();
		eat(p2);
		YacheTime p3 = new YacheTime();
		eat(p3);
		SwihgChip p4 = new SwihgChip();
		eat(p4);
	}
	public static void eat(Snack snack) {
	snack.eat();
	//만약 먹는 과자가 야채타임 이라면
	// --> 야채타임으로 부터 업캐스팅 된 객체라면
	//케찹을 찍어 먹고 싶어요!! 
	if(snack instanceof YacheTime) {
		//다운 캐스팅해서 케찹찍기
		//하위클래스명 객체명 = (하위클래스명) 업캐스팅된객체명
		YacheTime p3 = (YacheTime) snack;
		p3.ketchup();
	}
}
}
