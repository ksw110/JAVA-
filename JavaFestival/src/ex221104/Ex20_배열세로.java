package ex221104;

public class Ex20_배열세로 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int cnt = 1;
		
		for(int k = 0; k < array.length ; k++) {
			for(int i = 0; i < array.length ; i++) {
				
				array[i][k] = cnt++;
			}
			
		}
		for(int k =0; k <array.length; k++) {
			for(int i = 0 ; i < array.length ; i++) {
				
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
