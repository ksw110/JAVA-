
public class Ex09_증감연산자2 {
	public static void main(String[] args) {

		int opr = 0;

		opr += 3; // opr == 3
		
		// 출력하고 1증가

		System.out.println(opr++); // 3 
		
		System.out.println(opr);   // 4
		
		// 1증가하고 출력
		System.out.println(++opr); // 5
		System.out.println(opr);   // 5
		
		// 출력하고 1감소
		System.out.println(opr--); // 5
		System.out.println(opr);   // 4
		
		// 1감소하고 출력
		System.out.println(--opr); // 3
		System.out.println(opr);   // 3

	}
}
