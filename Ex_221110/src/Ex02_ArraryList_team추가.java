import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_ArraryList_team추가 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> team = new ArrayList<String>();

		for (int k = 0; k < 5; k++) {
			System.out.print("이름을 입력하세요 : ");
			team.add(k, sc.next());
		}
		System.out.print("탈퇴 시킬 팀원 : ");
		String delete = sc.next();
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).equals(delete)) {
				team.remove(i);
			}
		}
		System.out.print("팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");
				




	}

}
