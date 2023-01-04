import java.util.Scanner;

public class Ex10_삼항연산자 {

	public static void main(String[] args) {

		// 삼항 연산자 : 간단한 조건식을 이용해서 식을 제어하는 연산자
		// (조건식) ? (조건식이 true일때 실행문) : (조건식이 false일 때 실행문)
		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int num1 = sc.nextInt();
		System.out.print("num : ");
		int num2 = sc.nextInt();

		System.out.println(num1 > num2 ? true:false);
		sc.close();
	}

}
