import java.util.Scanner;

public class Ex11_삼항연산자2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int num2 = 2;
		System.out.println(num % num2 == 1 ? "홀수" : "짝수");

		sc.close();
	}

}
