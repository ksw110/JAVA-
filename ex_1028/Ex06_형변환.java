package ex_1028;

public class Ex06_형변환 {

	public static void main(String[] args) {

		// 자동 형변환 , 묵시적 형변환

		int num = 5;
		System.out.println(num);

		double num2 = num;// 정수형을 실수형으로 변환하여 5.0으로 출력이됨
		System.out.println(num2);

		// 강제 형변환 , 명시적 형변환
		double num3 = 5.6;
		System.out.println(num3);
		int num4 = (int) num3; // 강제적으로 형변환 정수로 바뀌기때문에 소수점은 출력하지않음
		System.out.println(num4);

	}

}
