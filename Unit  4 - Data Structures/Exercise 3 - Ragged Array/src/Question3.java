
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [][][] = new int [3][4][5];
		int count = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				for (int z = 0; z < array[x][y].length; z++) {
					count++;
				}
			}
		}
		System.out.println(count);
		

	}

}
