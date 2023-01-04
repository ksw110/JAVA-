package jave;

import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Random rd = new Random();
	      Scanner sc = new Scanner(System.in);
	      int fail =0;
	      
	      do {
	            
	         int num1 = rd.nextInt(20);
	         int num2 = rd.nextInt(20);
	         int sum = num1 + num2;
	         System.out.print(num1 + " + " + num2 + " = ");
	         int input = sc.nextInt();
	         if (sum == input) {
	            System.out.println("Success");
	         } else {
	            System.out.println("Fail");
	            fail +=1;
	         }
	         if (fail == 5) {
	            System.out.println("==Game Over==");
	            break;
	         }

	      } while(true);
	}
			
			
			
			
		
		
	
}


