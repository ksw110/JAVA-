package 추상클래스예제;

public class EmployeeMain {

	public static void main(String[] args) {

		// PartTimeEmployee 객체를 만들어주세요!
		PartTimeEmployee part = new PartTimeEmployee("003", "김독자", 100, 25);
		part.print();
		//월급여
		
		System.out.println(part.getMoneyPay());
		
		
		TempEmployee temp = new TempEmployee("004", "김땡땡", 3500);
		temp.print();
		System.out.println(temp.getMoneyPay());
		
		
	}

}
