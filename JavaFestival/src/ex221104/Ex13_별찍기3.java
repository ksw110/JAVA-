package ex221104;

public class Ex13_별찍기3 {

	public static void main(String[] args) {

		   for(int i = 1 ; i <= 5 ; i ++) {
		         
		         
		         for(int k = 5 ; k > 0 ; k--) {
		         
		            if(i<k) {
		               System.out.print(" ");
		            }else {
		               System.out.print("*");
		            }
		         
		         
		         }System.out.println();
		      }
	}

}
