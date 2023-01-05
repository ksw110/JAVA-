package ex_1028;

public class Ex07_형변환2 {

	public static void main(String[] args) {

		byte num1 = 3; // -128 ~ 127 (256가지)
		int num2 = 8000;

		num1 = (byte) num2;
		System.out.println(num1); // 8000 / 256 = 31.25 ..... 64

		int num3 = 128; // 256씩 더하기
		num1 = (byte) num3;
		System.out.println(num3);
		// 값이 양의 방향으로 넘어가는 현상 : Overflow
		
		int num4 = -129;
		num1 = (byte)num4;
		System.out.println(num1);
		// 값이 음의 방향으로 넘어가는 현상 : Underflow
		
		int num5 =30000;
		short num6 = 0; // -32768 ~ 32767
		
		num6 = (short)num5; //들어있는 값과는 상관없이, 자료형이 일치하여야함 ->명시적형변환
		System.out.println(num6);
		System.out.println(256*31);
		System.out.println(8000-7936);

		short num7 = 3;
		int num8 = 90000;
		num7 = (short)num8;
		System.out.println(90000%65535);
		System.out.println(num7);
		
		String num = "10";
		//Integer.parseInt("문자열") --> 문자열을 숫자 타입으로 바꿔주세요!
		System.out.println(num+1); // 101
		System.out.println(Integer.parseInt(num)+1); // 11
				
	}

}
