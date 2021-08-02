
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PART A
		Comparisons(3);
		
		//PART B
		Comparisons(15);
		
		//PART C
		Comparisons(31);
		
		//PART D
		Comparisons (63);
		
		//PART E
		Comparisons(100);
		
		//PART F
		Comparisons(500);
		
		//PART G
		Comparisons (1000);
		
		//PART H
		Comparisons (10000);
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
