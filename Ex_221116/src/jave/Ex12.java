package jave;

public class Ex12 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 1;
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int k = 0; k < arr.length ; k++) {
				arr[i][k] = cnt++;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int k = 0 ; k < arr.length ; k++) {
				
				System.out.print(arr[k][i] + "\t");
			}System.out.println();
		}
	}

}
