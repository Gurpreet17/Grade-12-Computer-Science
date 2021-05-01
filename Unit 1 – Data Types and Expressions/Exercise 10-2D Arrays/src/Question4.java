
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,2,7},
			     	{3,9,1}};
		int i,j;

		for (i = a[0].length-1; i >= 0; i--) {
			for (j = a.length-1; j >= 0; j--)
				System.out.print(a[j][i]);
			System.out.println();
		}
		

	}

}
