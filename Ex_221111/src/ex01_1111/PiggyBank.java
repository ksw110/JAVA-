package ex01_1111;

public class PiggyBank {

	
	// 필드
	int money;
	
	// 메소드
	
	// 1. 저금하는 메소드
	// 사용자가 입금할 돈을 입력하면(매개변수) 현재 자산에 추가하는 기능
	public void deposit(int input) {
		money += input;
	}
	// 2. 출금하는 메소드
	// 사용자가 출금할 돈을 입력하면(매개변수) 현재자산에서 출금하는 기능
	public void withdraw(int output) {
		money -= output;
	}
	
	// 3. 잔액을 보여주는 메소드
	// 현재 재산을 출력하는 메소드
	public void showmoney() {
		
		System.out.println("현재 잔액 (┬┬﹏┬┬)" + money);
		
	}
	
}
