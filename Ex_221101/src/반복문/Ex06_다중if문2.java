package 반복문;
import java.util.Scanner;

public class Ex06_다중if문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		if (age >= 30 && age < 40) {
			System.out.println("30대 입니다.");
		} else if (age >= 20 && age < 30) {
			System.out.println("20대 입니다.");
		} else if (age >= 10 && age < 20) {
			System.out.println("10대 입니다.");
		}sc.close();
	}

}
