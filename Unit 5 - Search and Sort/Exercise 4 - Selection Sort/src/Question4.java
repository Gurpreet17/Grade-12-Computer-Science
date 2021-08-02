
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {8,9,6,1,2,4};
		selectSort(list);
		for (int x = 0; x < list.length; x++)
			System.out.print(list[x] + "\t");
	}
	
	public static void selectSort (double[] list) {
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
	}
	
	public static void selectSort (int [] list) {
		for (int top = 0; top <= list.length - 1; top++)
		{
			int smallLoc = list.length-1;
			for (int i = list.length - 1; i >= top; i--) {
				if (list[i] < list[smallLoc]) 
					smallLoc = i;	
			}
			
			int temp = list[top];
			list[top] = list[smallLoc];
			list[smallLoc] = temp;
		}
	}
}
