package ex221104;

public class Ex14_배열큰값 {

	public static void main(String[] args) {

		int[] arr = {10,56,21,55,35,555,14,26};
	      
	      int max = arr[0];
	      int min = arr[0];
	      System.out.print("배열에 있는 모든 값 : ");
	      for (int i = 0 ; i < arr.length ; i++) {
	         System.out.print(arr[i] + " ");
	         
	         if(arr[i] > max) {
	            max = arr[i];
	         }
	         else if(arr[i] < min ) {
	            min = arr[i];
	      }
	      }
	      System.out.println();
	      System.out.println("가장 큰 값 : " + max);
	      System.out.println("가장 작은 값 : " + min);
	}

}
