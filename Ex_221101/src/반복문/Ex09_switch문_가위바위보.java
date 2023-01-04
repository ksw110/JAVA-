package 반복문;
import java.util.Scanner;

public class Ex09_switch문_가위바위보 {

	public static void main(String[] args) {
		// 가위 바위 보 프로그램 만들기

		Scanner sc = new Scanner(System.in);

		// user1 , user2 이름 입력받기
		System.out.print("USER1 : ");
		String user1 = sc.next();

		System.out.print("USER2 : ");
		String user2 = sc.next();

		// user1 , user2 가 낸 가위 바위 보 입력받기
		System.out.print(user1 + "님>>");
		String rsp1 = sc.next();
		System.out.print(user2 + "님>>");
		String rsp2 = sc.next();

		// user1 , user2 가 낸 가위 바위 보 를 순서대로 담기
		String rsp = rsp1 + rsp2;

		switch (rsp) {
		// 무승부일 경우
		case "바위바위":
		case "가위가위":
		case "보보":
			System.out.println("무승부 !! ");
			break;
		// user1 이 승리할경우.
		case "바위가위":
		case "가위보":
		case "보바위":
			System.out.println(user1 + "님 승리!");
			break;
			// user2 가 승리할경우.
		case "바위보","가위바위","보가위":		// switch = ,로 케이스를 줄일수있음
			System.out.println(user2 + "님 승리!");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}sc.close();

	}

}
