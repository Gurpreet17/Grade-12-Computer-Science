
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {10,7,1,4,3,5,9};
		selectSort(list);
		for (int x = 0; x < list.length; x++)
			System.out.print(list[x] + "\t");
		

	}
	public static void selectSort (double[] list)
	{
	   for (int top = list.length - 1; top> 0; top--)
	   {
	      int largeLoc = 0;
	      for (int i = 1; i <= top; i++)
	         if (list[i] > list[largeLoc])
	            largeLoc = i;

	      if (list[largeLoc] != list[top]) {
	    	  double temp = list [top] ;
		      list[top] = list [largeLoc] ;
		      list[largeLoc] = temp;
	      }
	   }
	} 


}
