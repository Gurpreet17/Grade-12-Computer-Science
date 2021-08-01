package Section2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = new double [3];
		array[0] = 10;
		array[1] = 100;
		array[2] = 1000;
		System.out.println(max(array) + " is the largest value in the array");

	}
	
	public static double max (double [] array) {
		double max = 0;
		for (int x = 0; x < array.length; x++) {
			if (max <= array[x])
				max = array[x];
		}
		return max;
	} 

}
