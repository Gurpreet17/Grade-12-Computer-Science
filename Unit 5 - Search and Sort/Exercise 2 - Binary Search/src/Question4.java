
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items = 7;
		Comparisons(items);

		

	}
	
	public static void Comparisons (int items) {
		int comparisons = 0;
		int temp = items;
		while (temp >= 1) {
			temp = temp/2;
			comparisons ++;
		}
		System.out.println("It will maximum number of " + comparisons + " comparisons to perform a binary search on a list containing " + items + " items");
	}

}
