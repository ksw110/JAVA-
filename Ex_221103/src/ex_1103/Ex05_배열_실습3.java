package ex_1103;

public class Ex05_배열_실습3 {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 555, 6, 7, 8, 9, 250 };

		int max =0 ;
		System.out.print("가장 큰수는 ");
		for (int i = 0; i < intArray.length; i++) {

			if (max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.print(max + " 입니다.");
		
		System.out.println();
		int[] intArray2 = { 30,-1,25,1, 2, 3, 4, 555, 6, 7, 8, 9, 250 };
		
		int min =intArray[0] ;
		System.out.print("가장 작은 수 는 ");
		for (int i = 0; i < intArray.length; i++) {
			
			if (min > intArray2[i]) {
				min = intArray2[i];
				
			}
		}
		System.out.print(min + " 입니다.");

	}

}
