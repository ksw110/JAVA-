import java.util.Scanner;

public class Ex03_for문_구구단3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단과 곱해지는 수 입력받아서 구구단 작성");
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("곱해지는 수 입력 : ");
		int num2 = sc.nextInt();
		int num3 = 1;
		for (int i = num1; num3 <= num2; num3++) {
			System.out.println(i + " * " + num3 + " = " + num1 * num3);
		}
		sc.close();

	}

}
