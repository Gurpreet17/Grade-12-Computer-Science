
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,2,7},
	     			{3,9,1}};
		
		Print (a);

	}
	
	/*
	 * This method will print each row of of an 2D array
	 * on its own line with one blank between each element.
	 * pre: 2D array of the type int
	 * post: Prints each row of array 
	*/
	public static void Print (int [][] a) {
		for (int x = 0; x <= a[0].length-1; x++) {
			for (int y = 0; y <= a.length-1; y++ )
				System.out.print(a[y][x] + " ");
			System.out.println();
		}
	}

}
