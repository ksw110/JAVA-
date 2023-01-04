package while문;

import java.util.Scanner;

public class Ex09_실습3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "b";

		while (!(a.equals("N"))) {
			System.out.print("첫 번째 정수를 입력하세요 >>");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >>");
			int num2 = sc.nextInt();
			System.out.print("[1] 더하기 [2] 빼기 >>");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("더하기 연산결과는" + (num1 + num2) + "입니다.");
				System.out.print("다시 실행하시겠습니까? (Y/N)>>");
				a = sc.next();
				}
				else if (menu == 2) {
					System.out.println("빼기 연산결과는" + (num1 - num2) + "입니다.");
					System.out.print("다시 실행하시겠습니까? (Y/N)>>");
					a = sc.next();
					if (a.equals("Y")) {
					} else if (a.equals("N")) {
						System.out.println("종료합니다.");
						break;	
				}else {while(true) {
					System.out.println("잘못된 명령입니다.");
					System.out.println("다시 실행하시겠습니까? (Y/N)>>");
					a = sc.next();
					if(a.equals("Y")) {
						break;}else if(a.equals("N")) {
							System.out.println("종료합니다.");
							break;
						}
					}
				}sc.close();
				
				}
			}
			}
		}
	


