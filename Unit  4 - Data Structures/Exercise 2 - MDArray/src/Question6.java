
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] parameter = {{1,2,3,4}, {5,6,7,8}};
		System.out.println(max(parameter));

	}
	
	public static int max (int [][] parameter) {
		int max = 0;
		for (int x = 0; x < parameter.length; x++) {
			for (int y = 0; y < parameter[x].length; y++) {
				if (max < parameter[x][y])
					max = parameter[x][y];
			}
		}
		return max;
	}

}
