import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of items to be processed:");
		int items = input.nextInt();
		double [] list = new double[items];
		for (int x = 0; x < list.length; x++) {
			System.out.println("Enter value " + (x+1));
			list[x] = input.nextInt();
		}
		
		insertSort(list);
		System.out.println("The median of this list is " + Median(list));
		
	}
	
	public static void insertSort (double [] list) {
		for (int x = 0; x < list.length; x++) {
			double item = list[x];
			int i = x;
			while (i > 0 && item < list[i-1]) {
				list[i] = list[i-1]; 
				i--;
			}
			list[i] = item;
		}
	}
	
	public static double Median (double [] list) {
		double median;
		if (list.length < 1 )
			median = 0;
		else if (list.length % 2 == 0)
			median = (list[list.length/2] + list[(list.length/2) - 1])/2;
		else 
			median = list[(list.length-1)/2];
		return median;
	}

}
