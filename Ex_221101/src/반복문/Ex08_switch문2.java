package 반복문;
import java.util.Scanner;

public class Ex08_switch문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇월인가요 : ");
		int month = sc.nextInt();

		//if(month == 12 || month == 1 || month == 2 ) {
			//switch 는 if 문으로 바꿀수있음 if 문을 switch로는 안됨
		//}
		
		switch (month) {
		case 12,1,2:System.out.println("겨울");
		break;
		case 3,4,5:
			System.out.println("봄");
		break;
		case 6,7,8:
			System.out.println("여름");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		break;
		default: System.out.println("잘못 입력하셨습니다.");

		}sc.close();
	}

}
