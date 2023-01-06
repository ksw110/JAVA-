
public class Ex05_대입연산자 {
	public static void main(String[] args) {

		// 10 이라는 변수 num에 대입

		int num = 10;
		int num2 = num + 5;
		
		//복합 대입연산자
		int num3 = 7;
		num3 = num3 + 12;
		num3 += 12; // 원래 데이터(값)에 12를 더해서 다시 대입해주세요 라는 뜻.
		System.out.println(num3);
		
		num3 -= 5;
		System.out.println(num3);
		num3 *= 10;
		System.out.println(num3);
		num3 /= 5;
		System.out.println(num3);
		num3 %= 5;
		System.out.println(num3);

	}
}
