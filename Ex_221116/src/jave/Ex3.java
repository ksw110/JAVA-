package jave;

public class Ex3 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1 , j = -2 ; i <=100 ; i+=2 ,j-=2 ) {
			sum =sum+ i + j;
			System.out.print(i + " " + j + " ");
		}System.out.println();
		System.out.println("결과 : " + sum);
	}

}
