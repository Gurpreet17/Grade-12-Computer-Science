
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,2,7},
			     {3,9,1}};
		int i,j;
		
		for (j = a[0].length - 1; j >= 0; j--) {
			for (i = a.length - 1; i >=0; i--) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}


	}

}
