package jave;

public class Ex13 {
public static void main(String[] args) {
	
	

	String[] score1 = {"A,A,B,C,D,A,C,D,D,D,F"} ;
	int[] abcdf = new int[5];
	for (int i = 0; i < score1.length; i++) {

		if ("A".equals(score1[i])) {
			++abcdf[0];
		} else if ("B".equals(score1[i])) {
			++abcdf[1];
		} else if ("C".equals(score1[i])) {
			++abcdf[2];
		} else if ("D".equals(score1[i])) {
			++abcdf[3];
		} else if ("F".equals(score1[i])) {
			++abcdf[4];
		}}
	System.out.println("A : " + abcdf[0] + "명");
	System.out.println("B : " + abcdf[1] + "명");
	System.out.println("C : " + abcdf[2] + "명");
	System.out.println("D : " + abcdf[3] + "명");
	System.out.println("F : " + abcdf[4] + "명");
}
}
