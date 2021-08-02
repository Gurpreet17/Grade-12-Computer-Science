
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {8,9,6,1,2,4};
		selectSort(list,2);
	}
	
	public static void selectSort (double[] list, int value) {
		for (int top = 0; top <= list.length - 1; top++)
		{
			int smallLoc = list.length-1;
			for (int i = list.length - 1; i >= top; i--) {
				if (list[i] < list[smallLoc]) 
					smallLoc = i;	
			}
			
			double temp = list[top];
			list[top] = list[smallLoc];
			list[smallLoc] = temp;
		}
		
		if (value <= list.length-1) 
			for (int x = list.length - 1 - value; x < list.length-1; x++) 
				System.out.print(list[x] + "\t");
		
		else 
			for (int x = 0; x < list.length-1; x++) 
				System.out.print(list[x] + "\t");
		
	}

}
