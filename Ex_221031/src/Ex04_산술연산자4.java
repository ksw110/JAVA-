import java.util.Scanner;

public class Ex04_산술연산자4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 더하기 : " + (num1 + num2));
		System.out.println("두 수의 빼기 : " + (num1 - num2));
		System.out.println("두 수의 곱하기 : " + num1 * num2);
		System.out.println("두 수의 몫 : " + num1 / num2);
		System.out.println("두 수의 나머지 : " + num1 % num2);

	}
}
