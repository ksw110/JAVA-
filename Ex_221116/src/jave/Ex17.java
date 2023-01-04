package jave;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		
		ArrayList<Integer> arr = new ArrayList<>();
	      Scanner sc = new Scanner(System.in);
	      int num;

	      for (int i = 1; i <= 10; i++) {

	         System.out.print(i + "번 째 정수 입력 >> ");
	         num = sc.nextInt();
	         if (num % 3 == 0) {
	            arr.add(num);

	         }

	      }
	      System.out.print("3의 배수 >> ");
	      for (int i = 0; i < arr.size(); i++) {

	         System.out.print(arr.get(i) + " ");
	      }
	}
	}


