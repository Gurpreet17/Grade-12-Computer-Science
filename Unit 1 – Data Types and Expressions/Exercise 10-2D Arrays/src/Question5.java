
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = {{4,2,7},
			     	   {3,9,1}};
		
		double sum = Sum(a);
		System.out.println("The sum of the elements of the array is " + sum);


	}
	
	/*
	 * This method calculates the sum of the elements of the array passed to it.
	 * pre: 2D array of the type double
	 * post: returns sum
	*/
	public static double Sum (double [][] a) {
		double sum = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) 
				sum = sum + a[x][y];
		}
		return sum;
	}

}
