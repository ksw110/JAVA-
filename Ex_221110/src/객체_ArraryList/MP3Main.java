package 객체_ArraryList;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();

		MP3 music1 = new MP3("2002", "Anne Marie",".\\music\\Anne Marie - 2002.mp3");
		MP3 music2 = new MP3("깡", "Rain", ".\\music\\Rain - 깡.mp3");
		MP3 music3 = new MP3("SOLO", "JENNIE", ".\\music\\JENNIE - SOLO.mp3");
		MP3 music4 = new MP3("NO ONE", "이하이", ".\\music\\이하이 - NO ONE.mp3");
		MP3 music5 = new MP3("FANCY", "TWICE", ".\\music\\TWICE - FANCY.mp3");
		MP3 music6 = new MP3("Dalla Dalla", "Itzy", ".\\music\\Itzy - Dalla Dalla.mp3");

		ArrayList<MP3> ml = new ArrayList<MP3>();

		ml.add(music1);
		ml.add(music2);
		ml.add(music3);
		ml.add(music4);
		ml.add(music5);
		ml.add(music6);

		// 틀 만들기
		// 1번 - 재생
		// 2번 - 정지
		// 3번 - 이전곡
		// 4번 - 다음곡
		// 5번 - 종료
		int index = 0;
		while (true) {

			System.out.print("[1]재생  [2]정지  [3]이전곡  [4]다음곡  [5]종료 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생
				// 제목 - 가수
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();

				System.out.printf("%s - %s%n", title, singer);

				mp3.play(path);
			} else if (menu == 2) {
				// 정지
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}

			} else if (menu == 3) {
				// 이전곡
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				index--;
				if (index < 0) {
					index = ml.size() - 1;
				}
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();
				System.out.printf("%s - %s%n", title, singer);
				mp3.play(path);

			} else if (menu == 4) {
				// 다음곡
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				index++;
				if (index >= ml.size()) {
					index = 0;
				}
				String title = ml.get(index).getTitle();
				String singer = ml.get(index).getSinger();
				String path = ml.get(index).getPath();
				System.out.printf("%s - %s%n", title, singer);
				mp3.play(path);

			} else if (menu == 5) {
				// 종료
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				System.out.println("프로그램 종료");

				break;
			} else {
				System.out.println("다시 입력해주세요~");
			}

		}

	}

}