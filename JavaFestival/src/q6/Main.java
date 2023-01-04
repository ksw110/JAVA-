package q6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("====음식점 보기====");
				Restaurant rr = new Restaurant("혜성식당", "음식점", 75, 75, 75);
				rr.println();
				Restaurant rr2 = new Restaurant("정림이네", "음식점", 92, 93, 92.7);
				rr2.println();
				Restaurant rr3 = new Restaurant("왕뼈사랑", "음식점", 78.3, 93.4, 92);
				rr3.println();
			} else if (menu == 2) {
				System.out.println("====미용실 보기====");
				Restaurant rr = new Restaurant("박승철", "음식점", 70, 100, 75.5);
				rr.println();
				Restaurant rr2 = new Restaurant("이가자", "음식점", 92, 50.4, 92.7);
				rr2.println();
				Restaurant rr3 = new Restaurant("리안", "음식점", 78.3, 93.4, 30.4);
				rr3.println();

			} else if (menu == 3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				name = sc.next();
				System.out.println("가게명 : " + name);
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t",10,20,30,40,50,60,70,80,90,100);
				
			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해 주세요.");
			}
		}
	}
}
