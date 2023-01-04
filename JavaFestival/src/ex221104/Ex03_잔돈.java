package ex221104;

import java.util.Scanner;

public class Ex03_잔돈 {

	public static void main(String[] args) {

//		거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
//		프로그램을 작성하시오.
//		단, 최대단위는 10000원, 최소단위는 100원
		
		
	  Scanner sc = new Scanner(System.in);
	  
	  int[] coin = {10000,5000,1000,500,100,};
	  System.out.print("총금액 입력 : ");
	    int money = sc.nextInt();
	   
	    System.out.println("잔돈 : " + money + "원");
	    for (int i = 0; i < coin.length; i++) {
	        System.out.println(coin[i]+"원: "+ money / coin[i]);
	        money %= coin[i];
		  
	  }
	  
	  
//	  System.out.print("10000원 : ");
//	  System.out.print("5000원 : ");
//	  System.out.print("1000원 : ");
//	  System.out.print("500원 : ");
//	  System.out.print("100원 : ");
	  
	  
	  
	}

}
