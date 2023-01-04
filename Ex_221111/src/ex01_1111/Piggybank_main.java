package ex01_1111;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Piggybank_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PiggyBank pig1 = new PiggyBank();
		
		
		
		System.out.print("입금 액 : ");
		pig1.deposit(sc.nextInt());
		System.out.print("출금 액 : ");
		pig1.withdraw(sc.nextInt());
		pig1.showmoney();
		
	}

}
