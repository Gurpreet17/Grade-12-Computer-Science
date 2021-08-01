
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] array = {{5, 8},
                           {3, -4,  7, 1, 5},
                           {6, 4, 12}};
		
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}

	}

}
