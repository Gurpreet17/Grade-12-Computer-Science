
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{2,4,6},{8,10},{12,14,16,18,20},{0}};
		int max = 0;
		for (int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[x].length; y++) {
				if (max < array[x][y])
					max = array[x][y];
			}
		}
		System.out.println("The max value is " + max);
	}

}
