package ex_1103;

public class Ex04_배열_실습2 {

	public static void main(String[] args) {

		int[] intArray = {1,3,5,6,7,8,9,10,11};
		
		int cnt = 0;
		System.out.print("intArray에 들어있는 홀수는 ");
		for (int i = 0 ; i < intArray.length ; i++  ) {
			
			
			if(intArray[i] % 2 == 1 ) {
				cnt++;
				System.out.print(" ");
				System.out.print(intArray[i]+ " ");
				
			}
		}
		System.out.print("홀수의 총 개수는 " + cnt + " 개 입니다.");
	}

}
