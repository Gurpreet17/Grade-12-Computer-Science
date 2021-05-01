
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,2,7},
		     		{3,9,1}};
		
		int max = Max (a);
		System.out.println("the maximum value of the elements in the array is " + max);
		

	}
	
	/*
	 * This method will return the maximum value of the 
	 * elements in a two-dimensional array of int values
	 * pre: 2D array of the type int
	 * post: returns max
	*/
	public static int Max (int [][] a) {
		int max = a[0][0];
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y<a[x].length; y++) {
				if (max<a[x][y])
					max = a[x][y];
			}
		}
		return max;
	}

}