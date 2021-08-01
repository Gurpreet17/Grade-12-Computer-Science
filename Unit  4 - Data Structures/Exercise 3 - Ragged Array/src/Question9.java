
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] array = {{5, 8},
                           {3, -4,  7, 1, 5},
                           {6, 4, 12}};

		int sum;
		int x=0;
		int y = 0;
		
		for (; y < array[x].length; y++) {
			sum = 0;
			x=0;
			for (; x < array.length; x++) {
				if (y < array[x].length) {
					System.out.println(x + " " + y);
					sum = sum + array[x][y];
				}	
			}
			System.out.println("The sum of COLUMN " + (y+1) + " is " + sum);
		}

	}

}
