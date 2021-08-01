
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] array = new int [3][];	//Ragged array
		array[0] = new int[4];
		array[1] = new int [2];
		array[2] = new int [10];
		for (int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}

	}

}
