
public class Ex05_for문_구구단5 {

	public static void main(String[] args) {

		
		for(int k = 2 ; k <=9 ; k++) {
			
			System.out.print(k + "단 : ");
			for(int i = 1; i <= 9 ; i++) {
				System.out.print(k + "*" + i + "=" + k * i + "\t");
				
			}
			System.out.println("");
		}
	}

}
