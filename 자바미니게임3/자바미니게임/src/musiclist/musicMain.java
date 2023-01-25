package musiclist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.DAO;
import model.musicDTO;

public class musicMain {

	public void main() {
		DAO dao = new DAO();
		Scanner sc = new Scanner(System.in);
		MP3Player musicDTO = new MP3Player();

		musicDTO music1 = new musicDTO("afterlike", "ive", ".\\music\\ive-afterlike(2초).mp3");
		musicDTO music2 = new musicDTO("그때그순간그대로", "wsg", ".\\music\\wsg-그때그순간그대로(2초).mp3");
		musicDTO music3 = new musicDTO("사건의지평선", "윤하", ".\\music\\윤하-사건의지평선(2초).mp3");
		musicDTO music4 = new musicDTO("소주한잔", "임창정", ".\\music\\임창정-소주한잔(2초).mp3");
		musicDTO music5 = new musicDTO("새삥", "지코", ".\\music\\지코-새삥(2초).mp3");
		musicDTO music6 = new musicDTO("반만", "진민호", ".\\music\\진민호-반만(2초).mp3");
		musicDTO music7 = new musicDTO("노을", "청혼", ".\\music\\청혼-노을(2초).mp3");

		musicDTO music11 = new musicDTO("afterlike", "ive", ".\\music\\ive-afterlike(4초).mp3");
		musicDTO music12 = new musicDTO("그때그순간그대로", "wsg", ".\\music\\wsg-그때그순간그대로(4초).mp3");
		musicDTO music13 = new musicDTO("사건의지평선", "윤하", ".\\music\\윤하-사건의지평선(4초).mp3");
		musicDTO music14 = new musicDTO("소주한잔", "임창정", ".\\music\\임창정-소주한잔(4초).mp3");
		musicDTO music15 = new musicDTO("새삥", "지코", ".\\music\\지코-새삥(4초).mp3");
		musicDTO music16 = new musicDTO("반만", "진민호", ".\\music\\진민호-반만(4초).mp3");
		musicDTO music17 = new musicDTO("노을", "청혼", ".\\music\\청혼-노을(4초).mp3");

		musicDTO music21 = new musicDTO("afterlike", "ive", ".\\music\\ive-afterlike(6초).mp3");
		musicDTO music22 = new musicDTO("그때그순간그대로", "wsg", ".\\music\\wsg-그때그순간그대로(6초).mp3");
		musicDTO music23 = new musicDTO("사건의지평선", "윤하", ".\\music\\윤하-사건의지평선(6초).mp3");
		musicDTO music24 = new musicDTO("소주한잔", "임창정", ".\\music\\임창정-소주한잔(6초).mp3");
		musicDTO music25 = new musicDTO("새삥", "지코", ".\\music\\지코-새삥(6초).mp3");
		musicDTO music26 = new musicDTO("반만", "진민호", ".\\music\\진민호-반만(6초).mp3");
		musicDTO music27 = new musicDTO("노을", "청혼", ".\\music\\청혼-노을(6초).mp3");

		ArrayList<musicDTO> ml = new ArrayList<musicDTO>();
		ml.add(music1);
		ml.add(music2);
		ml.add(music3);
		ml.add(music4);
		ml.add(music5);
		ml.add(music6);
		ml.add(music7);
		ml.add(music11);
		ml.add(music12);
		ml.add(music13);
		ml.add(music14);
		ml.add(music15);
		ml.add(music16);
		ml.add(music17);
		ml.add(music21);
		ml.add(music22);
		ml.add(music23);
		ml.add(music24);
		ml.add(music25);
		ml.add(music26);
		ml.add(music27);

		String[] arr = { "afterlike", "그때그순간그대로", "사건의지평선", "소주한잔", "새삥", "반만", "청혼" };

		int sum = 0;
		int score = 10;
		int index = 0;
		
		while (true) {
			System.out.print("[1] 문제시작 [2] 종료 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				
				
				for (int i = 0; i < arr.length; i++) {

					System.out.print("[1] 정답 [2] 힌트 [3] 다음문제 ");
					String title = ml.get(index).getTitle();
					String singer = ml.get(index).getSinger();

					String path = ml.get(index).getPath();

					musicDTO.play(path);

					int menu2 = sc.nextInt();

					if (menu2 == 1) {

						title = ml.get(index).getTitle();
						singer = ml.get(index).getSinger();
						path = ml.get(index).getPath();

						System.out.print("정답 입력 : " );
						String answer = sc.next();

						if (title.equals(answer)) {

							index++;

							if (index >= ml.size()) {
								index = 0;

							}
							sum += score;
							System.out.println("정답입니다! 현재 점수 : " + sum + "점입니다!");
							path = ml.get(index).getPath();
						} else {
							System.out.println("땡!!");
						}
					}

					else if (menu2 == 2) {

						singer = ml.get(index).getSinger();
						path = ml.get(index).getPath();

						System.out.println("이노래의 가수이름은 "+singer);

					} else if (menu2 == 3) {
						System.out.println(arr[i]);
						index++;
						if (index >= ml.size()) {
							index = 0;
						}
						title = ml.get(index).getTitle();
						singer = ml.get(index).getSinger();
						path = ml.get(index).getPath();

						musicDTO.play(path);
						

					}
				
				}
				System.out.println("수고하셨습니다");

			}

			else if (menu == 2) {
				if(musicDTO.isPlaying() == true) {
				musicDTO.stop();}
				System.out.print("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해주세요.");

			}
		}

	}

}
