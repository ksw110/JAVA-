
public class Ex06_for문_구구단6 {

	public static void main(String[] args) {

		
		System.out.println("2단"+"\t"+"3단"+"\t"+"4단"+"\t"+"5단"+
				"\t"+"6단"+"\t"+"7단"+"\t"+"8단"+"\t"+"9단"+"\t");
	
		for (int j = 1; j <= 9; j++) {
			
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println("");

		}
	}

}
