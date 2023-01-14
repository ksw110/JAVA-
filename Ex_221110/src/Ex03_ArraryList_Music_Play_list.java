import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_ArraryList_Music_Play_list {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> music = new ArrayList<String>();
		System.out.println("=====Music Play List====");
		System.out.println();
		int index = 0;
		while (true) {
			System.out.print("[1] 노래추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("==================================");
				System.out.print("[1]원하는 위치에 입력 [2] 마지막 위치에 추가 >> ");
				int num = sc.nextInt();

				if (num == 1) {
					System.out.print("원하는 위치 입력 : ");
					index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					music.add(index - 1, title);
				} else {
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					music.add(title);

				}

			} else if (menu == 2) {
				// 조회
				System.out.println("================현재 재생목록 ==================");
				if (music.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < music.size(); i++) {
						System.out.println(i + 1 + ". " + music.get(i));
					}
				}

			} else if (menu == 3) {
				// 삭제
				System.out.println("==================================");
				System.out.print("[1] 선택 삭제 [2] 전체삭제 >> ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					int num1 = sc.nextInt();
					System.out.println(num1 + ". " + music.get(index) + " 노래가 삭제되었습니다.");
					music.remove(index);
				} else if (num == 2) {
					music.clear();
					System.out.println("노래가 전체 삭제 되었습니다.");
				} else {
					System.out.println("잘못 입력 하셨습니다!");
				}
			} else if (menu == 4) {
				// 종료
				System.out.println("프로그램 종료.");

				break;
			}

		}

	}

}
