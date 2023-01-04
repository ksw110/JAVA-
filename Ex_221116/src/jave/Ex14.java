package jave;

public class Ex14 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int k = 0; k < arr.length; k++) {
				arr[i][k] = cnt++;
			}
		}
		for (int i = 0; i < arr.length; i++) {

			for (int k = 0; k < arr.length; k++) {

				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int num = 5;
		for (int i = 0; i < arr.length; i++) {
			num--;
			for (int k = 0; k < arr.length; k++) {

				System.out.print(arr[k][num] + "\t");
			}
			System.out.println();
		}
	}

}
