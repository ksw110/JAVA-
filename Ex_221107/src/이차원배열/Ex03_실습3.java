package 이차원배열;

public class Ex03_실습3 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		
		int cnt = 0;
		for(int i = 0 ; i < array.length ; i++) {
			
			
			for (int k = 0 ; k < array[i].length ; k++) {
				array[i][k] = ++cnt;
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
