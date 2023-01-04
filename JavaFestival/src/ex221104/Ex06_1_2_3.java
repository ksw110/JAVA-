package ex221104;

public class Ex06_1_2_3 {

	public static void main(String[] args) {

		
		int sum=0;
	      for(int i=1,j=-2;i<100;i+=2,j-=2) {
	         System.out.print(i+" "+j+" ");
	         sum=sum+i+j;
	      
	      }System.out.println();
	      System.out.print("결과 : "+sum);
	}

}
