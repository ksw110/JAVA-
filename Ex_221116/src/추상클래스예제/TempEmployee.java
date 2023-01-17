package 추상클래스예제;

public class TempEmployee extends Employee{

	//empno
	//name
	//pay
	
	//연봉/12 --> 월급여
	
	//월 급여를 반환해 주는 역할
	@Override
	public int getMoneyPay() {
		
		return pay/12;
		
		
	}
	//print 정보를 출력시켜주는 역학 --> Employee 에서 물려받음
	//생성자는 메소드이름과 클래스이름과 같아야한다
	public  TempEmployee(String empno, String name,int pay) {
		this.pay = pay;
		this.empno = empno;
		this.name = name;
		
	}

}
