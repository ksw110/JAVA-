package 이차원배열;

public class Ex05_실습5 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int cnt = 20;
		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array[i].length; k++) {
				array[i][k] = ++cnt;

			}
		}
		
		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array[i].length; k++) {
				System.out.print(array[i][4-k]+"\t");
          
			}System.out.println();
		}System.out.println();
//		for (int i = 0; i < array.length; i++) {
//
//			for (int k = 0; k < array[i].length; k++) {
//				System.out.print(array[k][4-i]+"\t");
//          
//			}System.out.println();
//		}
	}

}
