package Section2;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Case 1 - When both arrays equal to each other
		double [] a = {1,2,3,4,5};
		double [] b = {1,2,3,4,5};
		System.out.println(equals(a,b));
		
		//Test Case 2 - When both arrays are NOT equal to each other
		double [] c = {1,2,3,4,5};
		double [] d = {6,7,8,9,10};
		System.out.println(equals(c,d));
		
	}
	
	public static boolean equals (double[] a, double[] b) {
		
		if (Arrays.equals(a,b))
			return true;
		else
			return false;
	}

}
