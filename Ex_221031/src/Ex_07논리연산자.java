
public class Ex_07논리연산자 {
	public static void main(String[] args) {

		// 논리연산자
		// 결과 값 : boolean 자료형
		// 부정연산자 (NOT)
		// 앞선 값에 반대되는 값으로 나타내고 싶을때
		
		boolean check = true;
		System.out.println(check);
		System.out.println(!check);
		
		// NOT , AND , OR
		// !(NOT !(피연산자)
		// &&(AND) = 두개다 참일때 true ||(OR) = 두개다 거짓일때 false (피연산자1)||(피연산자2)
		// 피연산자가 boolean 타입이어함
//		System.out.println(!true);
//		System.out.println(true);
//		System.out.println(false);
//		System.out.println(!false);
		
		//&&(AND 연산자 , 곱 연산자)
		//||(OR 연산자 , 합 연산자)
		System.out.println((1<3)&&(4<5)); //true
		System.out.println((2<1)&&(4<5)); //false
		System.out.println((4<2)||(1<3)); //true
		System.out.println((2<1)||(4<2)); //false
		
		
	}
}
