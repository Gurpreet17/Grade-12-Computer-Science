
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {6,2,8,3,1,7,4};
		insertSort(list);
		for (int x = 0; x < list.length; x++) 
			System.out.print(list[x] + "\t");
	}
	
	public static void insertSort (double[] list)
	{
	  for (int top = 1; top < list.length; top++)
	  {
	    double item = list [top];
	    int i = top; 
	    while (i > 0 && item < list[i-1])
	    {
	      list[i] = list [i-1] ;
	      i--;
	    }
	    list[i] = item;
	  }
	}

}
