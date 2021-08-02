
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {6,2,8,3,1,7,4};
		insertSort(list);
		for (int x = 0; x < list.length; x++) 
			System.out.print(list[x] + "\t");
		
		//TOP = 1
		//6,6,8,3,1,7,4
		//2,6,8,3,1,7,4
		
		//TOP = 2
		//2,6,8,3,1,7,4
		
		//TOP = 3
		//2,6,8,8,1,7,4
		//2,6,6,8,1,7,4
		//2,3,6,8,1,7,4
		
		//TOP = 4
		//2,3,6,8,8,7,4
		//2,3,6,6,8,7,4
		//2,3,3,6,8,7,4
		//2,2,3,6,8,7,4
		//1,2,3,6,8,7,4
		
		//TOP = 5
		//1,2,3,6,8,8,4
		//1,2,3,6,7,8,4
		
		//TOP = 6
		//1,2,3,6,7,8,8
		//1,2,3,6,7,7,8
		//1,2,3,6,6,7,8
		
		//FINAL 
		//1,2,3,4,6,7,8
		
	}
	
	public static void insertSort (double[] list)
	{
	  for (int top = 1; top < list.length; top++)
	  {
	    double item = list [top];
	    int i = top; 
	    while (i > 0 && item  < list[i-1])
	    {
	      list[i] = list [i-1];
	      System.out.println(top);
	      i--;
	    }
	    list[i] = item;
	  }
	}


}
