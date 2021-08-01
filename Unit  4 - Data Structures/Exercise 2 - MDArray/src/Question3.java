
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,2,7},
			        {3,9,1}};
		int i,j;
		
		//PART A
		for(i = 0; i < a.length; i++)
		{
		  for(j = 0; j < a[0].length; j++)
		    System.out.print(a[i][j]);
		  System.out.println();
		}

		//PART B
		for(i = 0; i < a[0].length; i++)
		{
		  for(j = 0; j < a.length; j++)
		    System.out.print(a[j][i]);
		    System.out.println();
		} 
		
		//PART C
		for(i = a.length - 1; i >= 0; i--)
		{
		  for(j = 0; j < a[0].length; j++)
		    System.out.print(a[i][j]);
		  System.out.println();
		} 

		



	}

}
