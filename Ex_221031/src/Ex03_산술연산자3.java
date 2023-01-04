import java.util.Scanner;

public class Ex03_산술연산자3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		
		System.out.println();

//		int num = 456;
//		
//		 
		System.out.println(num / 100 * 100);
		System.out.println(num - num % 100);
		System.out.println(num / 100 + "00");
	}

}
