package ex_1028;

public class Ex05_자료형 {

	public static void main(String[] args) {

		// 1. 논리형
		// boolean : 1bit or 1byte (1과 0)
		// 참 혹은 거짓 (true or false)
		// 1byte = 8bit = 2^8 = 256가지

		boolean ishot = false; // true
		System.out.println(ishot);

		// 2.문자형
		// char : 2byte = 2^16 = 0 ~ 65,536 가지의 경우의수
		// -> 모든 유니코드 문자 표현 가능

		char grade = 'A';
		char num = '4';
		char single = '\''; // \t (텝) \n (엔터)

		char A = '김';
		char B = '시';
		char C = '우';
		
		System.out.print(A);
		System.out.print(B);
		System.out.println(C);
		
		// 3. 정수형
		// byte(-128 ~ 127)
		byte age = 20;
		// short (-32768 ~ 32767)
		short lunch = 7000;
		// int (-21억 ~ 21억)
		int account = 2000000000;
		// long
		long microbe = 1000000000000000l;
		// 숫자 끝에 L 을 입력하여 알려줘야한다 숫자만 입력시 int 로 인식

		// 4.실수형
		// float (소수점) 4byte
		float height = (float) 175.6; // or 175.6f; 가능
		// double 8byte
		double a = 12345646.12345645;
		
		// 레퍼런스 타입 : 기본 데이터 타입 8개 이외의 타입
		// 자바 책 : 65p
		// 기본변수는 소문자로 시작하지만 레퍼런스는 대문자로 시작한다
		// 문자열을 담는 타입 -> String
		String name = "김시우";
		System.out.println("나의 이름은 : " + name);
		
		
		
		
		

	}

}
