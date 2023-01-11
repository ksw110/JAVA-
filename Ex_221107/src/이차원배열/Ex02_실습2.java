package 이차원배열;

public class Ex02_실습2 {

	public static void main(String[] args) {

//		int[] array = { 1, 2, 3, 4, 5 };

		// 학생 3명의 국,영,수,사,과 를 저장하고 출력하기
		int[][] scores = { { 60, 50, 30, 60, 100 }, 
				           { 100, 30, 40, 50, 60 }, 
				           { 70, 80, 90, 100, 95 } };

		// 점수 -> 변수
		// 여러과목의 점수 -> 일차원배열
		// 여러 학생의 과목 점수 -> 이차원배열

		// 학생들의 모든 점수 출력
		// 0번 학생 ~ 2번 학생
		// - 0번학생 -> 0번과목 ~ 4번과목
		// - 1번학생 -> 0번과목 ~ 4번과목
		// - 2번학생 -> 0번과목 ~ 4번과목

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;

			System.out.print(i + "번학생 : ");
			for (int k = 0; k < scores[i].length; k++) {
				sum = sum + scores[i][k];

				System.out.print(scores[i][k] + " ");
			}
			System.out.println();
			System.out.println("평균 : " + sum/scores[i].length);
		}

	}

}
