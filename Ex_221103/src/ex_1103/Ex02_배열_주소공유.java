package ex_1103;

public class Ex02_배열_주소공유 {

	public static void main(String[] args) {

		// 배열 -> 래퍼런스 변수 -> 주소값을 저장
		// 주소를 공유 -> 같은공간을 공유
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		intArray[1] = 5;
		
		System.out.println(intArray[1]);
		System.out.println(myArray[1]);
		
		myArray[1] = 10;
		
		System.out.println(intArray[1]);
		System.out.println(myArray[1]);
		
		
	}

}
